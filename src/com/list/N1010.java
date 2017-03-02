package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 2..
 */
public class N1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[][] arr = new int[30][30];

        for (int i = 0; i < 30; i++) {
            arr[0][i] = i + 1;
        }
        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j - 1];
                }

            }
        }
        int x, y;

        for (int i = 0; i < totalCnt; i++) {
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            System.out.println(arr[x][y]);
        }
    }

}
