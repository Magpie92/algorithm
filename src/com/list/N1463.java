package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 1..
 */
public class N1463 {
    private static int[] arr = new int[1000000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        makeOne(scanner.nextInt(), 0);
        System.out.println(arr[0]);
    }

    private static void makeOne(int n, int cnt) {

        if (n < 1) {
            return;
        }

        if (arr[n - 1] <= cnt && arr[n - 1] > 0) {
            return;
        }
        arr[n - 1] = cnt;
        if (n % 3 == 0) {
            makeOne(n / 3, cnt + 1);
        }
        if (n % 2 == 0) {
            makeOne(n / 2, cnt + 1);
        }
        makeOne(n - 1, cnt + 1);

    }
}
