package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 2..
 */
public class N1932 {
    private static int[][] ans;
    private static int[][] tri;
    private static int totalCnt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        totalCnt = scanner.nextInt();
        ans = new int[totalCnt][totalCnt];
        tri = new int[totalCnt][totalCnt];
        for (int i = 0; i < totalCnt; i++) {
            for (int j = 0; j <= i; j++) {
                tri[i][j] = scanner.nextInt();
            }
        }
        triAngle();
    }

    private static void triAngle() {
        ans[0][0] = tri[0][0];
        for (int i = 1; i < totalCnt; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    ans[i][j] = tri[i][j] + ans[i - 1][j];
                } else if (j == i) {
                    ans[i][j] = tri[i][j] + ans[i - 1][j - 1];
                } else {
                    ans[i][j] = Math.max(ans[i - 1][j], ans[i - 1][j - 1]) + tri[i][j];
                }
            }
        }

        int num = 0;
        for (int i = 0; i < totalCnt; i++) {
            num = Math.max(ans[totalCnt - 1][i], num);
        }

        System.out.println(num);
    }
}
