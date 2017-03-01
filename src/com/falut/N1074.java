package com.falut;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 1..
 */
public class N1074 {

    private static int[][] arr;
    private static int N, r, c, num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        r = scanner.nextInt();
        c = scanner.nextInt();

        int Number = (int) Math.pow(2, N);
        arr = new int[Number][Number];

        cal(N, Number, Number);
        System.out.println(arr);
    }

    private static void cal(int n, int x, int y) {
        System.out.println(n);
        System.out.println(x + " " + y);
        if (n == 0) {
            arr[x][y] = num++;
            arr[x][y + 1] = num++;
            arr[x + 1][y] = num++;
            arr[x + 1][y + 1] = num++;
            return;
        }

        cal(n - 1, x / 2, y / 2);
        cal(n - 1, x, y / 2);
        cal(n - 1, x / 2, y);
        cal(n - 1, x, y);

    }

}
