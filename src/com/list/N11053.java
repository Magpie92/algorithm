package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N11053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[] arr = new int[1001];
        int[] dp = new int[1001];
        for (int i = 0; i < totalCnt; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < totalCnt; i++) {
            cnt = 0;
            for (int j = 0; j <= i; j++) {
                if (cnt < dp[j] && arr[j] < arr[i]) {
                    cnt = dp[j];
                }
            }
            dp[i] = cnt + 1;
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

}
