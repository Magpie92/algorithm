package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 2..
 */
public class N2579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[] arr = new int[totalCnt];
        int[][] dp = new int[totalCnt][2];
        for (int i = 0; i < totalCnt; i++) {
            arr[i] = scanner.nextInt();
        }
        if(totalCnt==1){
            System.out.println(arr[0]);
            return;
        }
        if(totalCnt==2){
            System.out.println(arr[0]+arr[1]);
            return;
        }
        dp[0][0] = arr[0];
        dp[0][1] = 0;
        dp[1][0] = arr[0] + arr[1];
        dp[1][1] = arr[1];

        for (int i = 2; i < totalCnt; i++) {
            dp[i][0] = dp[i - 1][1] + arr[i];
            dp[i][1] = Math.max(dp[i - 2][0], dp[i - 2][1]) + arr[i];
        }
        System.out.println(Math.max(dp[totalCnt - 1][0], dp[totalCnt - 1][1]));

    }

}
