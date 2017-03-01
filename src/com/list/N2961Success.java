package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 1..
 */
public class N2961Success {
    private static int n;
    private static int[] k = new int[10];
    private static int[] j = new int[10];
    private static int ans = 1000000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
            j[i] = scanner.nextInt();
        }
        mat(0, 1, 0);

        System.out.println(ans);
    }

    private static int diff(int x, int y) {
        return x < y ? y - x : x - y;
    }

    private static void mat(int i, int maum, int ssm) {
        if (i == n) {
            if (ssm > 0 && diff(maum, ssm) < ans) {
                ans = diff(maum, ssm);
            }
        } else {
            mat(i + 1, maum, ssm);
            mat(i + 1, maum * k[i], ssm + j[i]);
        }
    }
}
