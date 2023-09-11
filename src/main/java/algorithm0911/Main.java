package algorithm0911;

public class Main {

    private static final int[] TEST_CASES = {
            1,
            60,
            256,
            325,
            20_160,
            3_456_789,
            10_000_001,
            1_234_567_890
    };

    private static final String[] Test_CASES_RESULT = {
            "1 = 1",
            "2 * 2 * 3 * 5 = 60",
            "2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 = 256",
            "5 * 5 * 13 = 325",
            "2 * 2 * 2 * 2 * 2 * 2 * 3 * 3 * 5 * 7 = 20160",
            "3 * 7 * 97 * 1697 = 3456789",
            "11 * 909091 = 10000001",
            "2 * 3 * 3 * 5 * 3607 * 3803 = 1234567890"
    };

    public static void main(String[] args) {

//        for (int i = 0; i < TEST_CASES.length; i++) {
//            System.out.println("Test Case " + (i + 1) + " = " + test(TEST_CASES[i], Test_CASES_RESULT[i]));
//        }
//
//        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));

        StringBuilder sb = new StringBuilder();
        System.out.println(solution(60, 2, sb));
    }

    private static double correct = 0;

//    private static boolean test(int input, String result) {
//        if (solution(input).equals(result)) {
//            correct++;
//            return true;
//        }
//
//        return false;
//    }

//    public static String solution(int num) {
//        int origin = num;
//
//        List<Integer> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//
//        if (num == 1) {
//            list.add(1);
//        }
//
//        for (int i = 2; i <= num; i++) {
//            while (num % i == 0) {
//                list.add(i);
//                num /= i;
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//
//            sb.append(list.get(i));
//
//            if (i < list.size() - 1) {
//                sb.append(" * ");
//            }
//        }
//        sb.append(" = ").append(origin);
//
//        return sb.toString();
//    }


    public static StringBuilder solution(int num, int i, StringBuilder sb) {

        if (num == 1) {
            sb.append(1);
            return sb;
        }

        if (num == i) {
            sb.append(i);
        } else if (num % i == 0) {
            sb.append(i).append(" ");
            solution(num / i, i, sb);
        } else {
            solution(num, i + 1, sb);
        }

        return sb;
    }

}

