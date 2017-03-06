package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 3..
 */
public class N1912 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[] arr = new int[totalCnt];
        int[] dp = new int[totalCnt];
        for (int i = 0; i < totalCnt; i++) {
            arr[i] = scanner.nextInt();
        }
        dp[0] = arr[0];
        int ans = -2000;
        if (totalCnt == 1) {
            System.out.println(arr[0]);
            return;
        }
        for (int i = 1; i < totalCnt; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            ans = Math.max(dp[i], ans);
        }
        ans = Math.max(arr[0], ans);
        System.out.println(ans);

    }

}
