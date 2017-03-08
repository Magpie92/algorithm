package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N2293 {
    public static void main(String[] args) {
        int[] arr = new int[1001];
        int[] dp = new int[1001];
        Scanner scanner = new Scanner(System.in);
        int totalInt = scanner.nextInt();

        for (int i = 1; i <= totalInt; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i <= totalInt; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + arr[i - j]);
            }
        }
        System.out.println(dp[totalInt]);

    }

}
