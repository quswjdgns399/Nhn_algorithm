package algorithm1004;

import java.util.Scanner;

public class Main {

    static int[][] arr;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int tryNum = sc.nextInt();
        int[] result = new int[tryNum];

        for (int i = 0; i < tryNum; i++) {

            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();

            int sum = 0;

            for (int j = row1 - 1; j <= row2 - 1; j++) {
                for (int k = col1 - 1; k <= col2 - 1; k++) {
                    sum += arr[j][k];
                }
            }

            result[i] = sum;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
