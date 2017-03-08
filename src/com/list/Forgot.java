package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class Forgot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[] arr = new int[totalCnt];
        int cnt = 0;
        int num = 0;
        int ans = 0;


        for (int i = 0; i < totalCnt; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < totalCnt; i++) {
            num = 0;
            cnt = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] > num) {
                    num = arr[j];
                    cnt++;
                }
            }
            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);
    }

}
