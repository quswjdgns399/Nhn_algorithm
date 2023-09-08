package algorithm0908;

import java.util.Arrays;

public class Main {

    public static int solution(int start, int end) {
        return isPrimeSolution(start, end);
    }

    private static int isPrimeSolution(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i) == true) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
//        for (int i = 2; i <= num - 1; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println(
                    "Test Case " + (i + 1) + " = " + test(TEST_CASES[i][0], TEST_CASES[i][1], TEST_CASES_RESULTS[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));


        //  에라토스테네스 알고리즘
        int arr[] = new int[101];
        boolean[] prime = new boolean[101];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (!isPrime(i)) {
                for (int j = i; j < arr.length; j += i) {
                    prime[j] = true;
                    //false == 소수
                }
            }
        }

        System.out.println(Arrays.toString(prime));

    }


    private static boolean test(int start, int end, int result) {
        if (solution(start, end) == result) {
            correct++;
            return true;
        }

        return false;
    }


    private static double correct = 0;

    private static final int[][] TEST_CASES = {
            {1, 10},
            {1, 50},
            {1, 1000},
            {1, 100000},
            {5, 20},
            {11, 123},
            {55, 5555},
            {1000, 100000}
    };

    private static final int[] TEST_CASES_RESULTS = {
            4,
            15,
            168,
            9592,
            6,
            26,
            716,
            9424
    };

}