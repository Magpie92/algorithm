package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 25..
 */
public class N2775 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[][] array = new int[15][15];
        for (int i = 0; i < 14; i++) {
            array[0][i] = i + 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                sum += array[i - 1][j];
                array[i][j] = sum;
            }
            sum = 0;
        }

        int totalCnt = scanner.nextInt();
        int k, n;
        for (int i = 0; i < totalCnt; i++) {
            k = scanner.nextInt();
            n = scanner.nextInt();
            System.out.println(array[k][n-1]);
        }


    }
}
