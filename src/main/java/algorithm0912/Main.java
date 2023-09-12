package algorithm0912;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 24, 6, 48};
        System.out.println(solution(arr));
    }

    public static int compare(int num1, int num2) {
        int result = 0;
        int minValue = Math.min(num1, num2);
        for (int i = 1; i <= minValue; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                int count = i;
                result = count;
            }
        }
        return result;
    }

    public static int solution(int[] input) {
        int max = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int result = compare(input[i], input[j]);
                if (max < result) {
                    max = result;
                }
            }
        }

        return max;
    }

}