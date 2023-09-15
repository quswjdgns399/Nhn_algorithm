package algorithm0914;

import java.math.BigDecimal;

public class Main {

    public static class Fraction {
        private int numerator;  // 분자
        private int denominator;    // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }


        public void normalize() {
            int gcd = calculateGCD(numerator, denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }


        private static int calculateGCD(int a, int b) {
            if (b == 0) {
                return a;
            }
            return calculateGCD(b, a % b);
        }


        /**
         * 소수점 값에 대해 자리 수 계산 하는 메서드.    <br/>
         * ex)  <br/>
         * 0.01 -> 100을 곱하기 위해 2를 return    <br/>
         * 0.1 -> 10을 곱하기 위해 1을 return
         *
         * @param num 소수 값
         * @return 소수점 이하 자리 수 값
         */
        public static int getDecimalNumber(BigDecimal num) {

            String str = num.toPlainString();

            int count;
            int dotindex = str.indexOf(".");
            count = str.length() - dotindex - 1;
            return count;
        }

        public static String solution(String input) {
            BigDecimal number = new BigDecimal(input);

            int decimalNumber = getDecimalNumber(number);

            int numerator = (int) (number.doubleValue() * Math.pow(10, decimalNumber));
            double denominator = Math.pow(10, decimalNumber);


            return new Fraction(numerator, (int) denominator).toString();
        }

        @Override
        public String toString() {
            return this.numerator + "/" + this.denominator;
        }

    }

    public static void main(String[] args) {
        String result = Fraction.solution("-0.75");
        System.out.println(result.toString());
    }

}
