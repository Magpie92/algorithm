package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 3..
 */
public class N2156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[] arr = new int[totalCnt + 1];
        int[] ans = new int[totalCnt + 1];
        arr[0] = 0;
        for (int i = 1; i <= totalCnt; i++) {
            arr[i] = scanner.nextInt();
        }
        if (totalCnt == 1) {
            System.out.println(arr[1]);
            return;
        } else if (totalCnt == 2) {
            System.out.println(arr[1] + arr[2]);
            return;
        }
        ans[0] = 0;
        ans[1] = arr[1];
        ans[2] = arr[1] + arr[2];
        for (int i = 3; i <= totalCnt; i++) {
            ans[i] = maxim(ans[i - 3] + arr[i] + arr[i - 1],
                    maxim(ans[i - 2] + arr[i], ans[i - 1]));
        }
        System.out.println(ans[totalCnt]);

    }

    private static int maxim(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
