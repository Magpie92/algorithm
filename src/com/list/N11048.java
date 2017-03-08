package com.list;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N11048 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        int num1 = 0, num2 = 0, num3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                num1 = num2 = num3 = 0;
                if (i == 0 && j == 0) {
                    dp[0][0] = arr[0][0];

                } else {
                    if (i != 0) {
                        num1 = dp[i - 1][j] + arr[i][j];
                    }
                    if (j != 0) {
                        num2 = dp[i][j - 1] + arr[i][j];
                    }
                    if (i != 0 && j != 0) {
                        num3 = dp[i - 1][j - 1] + arr[i][j];
                    }
                    dp[i][j] = Math.max(num1, Math.max(num2, num3));
                }
            }
        }
        System.out.println(dp[n - 1][m - 1]);

    }

}
