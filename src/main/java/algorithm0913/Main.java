package algorithm0913;

public class Main {

    public static void main(String[] args) {

        System.out.println(solution(1234, 1222));

    }


    // solution
    private static int solution(int first, int second) {

        int maxValue = Math.max(first, second);
        int minValue = Math.min(first, second);


        int gcd = 0;
        for (int i = 1; i <= maxValue; i++) {
            if (maxValue % i == 0 && minValue % i == 0) {
                gcd = i;
            }
        }

        int result = maxValue * minValue / gcd;

        return result;
    }


}
