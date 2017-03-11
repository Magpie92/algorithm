package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 9..
 */
public class N11404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int busNum = scanner.nextInt();
        int[][] arr = new int[totalCnt][totalCnt];

        for (int i = 0; i < totalCnt; i++) {
            for (int j = 0; j < totalCnt; j++) {
                arr[i][j] = i == j ? 0 : 1000010;
            }

        }
        for (int i = 0; i < busNum; i++) {
            int n = scanner.nextInt() - 1, m = scanner.nextInt() - 1, num = scanner.nextInt();
            arr[n][m] = Math.min(arr[n][m], num);

        }

        for (int k = 0; k < totalCnt; k++) {
            for (int i = 0; i < totalCnt; i++) {
                for (int j = 0; j < totalCnt; j++) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }


        for (int i = 0; i < totalCnt; i++) {
            for (int j = 0; j < totalCnt; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
