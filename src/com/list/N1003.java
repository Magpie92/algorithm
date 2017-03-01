package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 1..
 */
public class N1003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        for (int i = 0; i < totalCnt; i++) {
            fibonacci(scanner.nextInt());
            System.out.println(cnt1 + " " + cnt2);
            cnt1 = 0;
            cnt2 = 0;
        }
    }

    static int cnt1 = 0, cnt2 = 0;

    private static int fibonacci(int n) {
        if (n == 0) {
            cnt1++;
            return 0;
        } else if (n == 1) {
            cnt2++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
