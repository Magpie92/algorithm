package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N9461 {
    public static void main(String[] args) {
        long[] arr = new long[102];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;
        for (int i = 5; i < 102; i++) {
            arr[i] = arr[i - 1] + arr[i - 5];
        }
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        for (int i = 0; i < totalCnt; i++) {
            System.out.println(arr[scanner.nextInt() - 1]);
        }
    }
}
