package algorithm0906;

public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            {"123", "123", "246"},
            {"1000", "1", "2"},
            {"456", "789", "1461"},
            {"5", "5", "1"},
            {"11112", "54321", "65433"},
            {"3829", "1300", "4139"}
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++) {
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));
        }

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res) {
            correctCount++;
        }
        return res;
    }

    // solution
    public static int solution(int a, int b) {
//        return reverse(reverse(a) + reverse(b));
//        return reverseArithmetic((reverseArithmetic(a)) + reverseArithmetic(b));
        return reverseRecursion(reverseRecursion(a) + reverseRecursion(b));
    }

    // use String
    static int reverse(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);

        }
        return Integer.parseInt(sb.toString());
    }

    // use Arithmetic

    static int reverseArithmetic(int n) {
        int reverse = 0;
        while (n != 0) {
            int reminder = n % 10;
            reverse = reverse * 10 + reminder;
            n = n / 10;
        }
        return reverse;
    }


    static int reverseRecursion(int n) {
        return reverseRecursionModule(n, 0);
    }

    static int reverseRecursionModule(int n, int reverse) {
        if (n < 10) {
            return reverse * 10 + n;
        } else {
            int reminder = n % 10;
            reverse = reverse * 10 + reminder;
            return reverseRecursionModule(n / 10, reverse);
        }
    }
}

