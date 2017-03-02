package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 2..
 */
public class N2167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i][j - 1] + scanner.nextInt();
            }
        }
        int totalCnt = scanner.nextInt();
        int x1, y1, x2, y2;
        for (int k = 0; k < totalCnt; k++) {
            int ans = 0;
            x1 = scanner.nextInt() - 1;
            y1 = scanner.nextInt() - 1;
            x2 = scanner.nextInt() - 1;
            y2 = scanner.nextInt() - 1;
            for (int i = x1; i <= x2; i++) {

                if (y1 == 0) {
                    ans += arr[i][y2];
                } else {
                    ans += arr[i][y2] - arr[i][y1 - 1];
                }
            }
            System.out.println(ans);
        }
    }

}
