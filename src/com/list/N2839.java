package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 11..
 */
public class N2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = num;
        int m = 0;
        while (n > 2) {
            if (n % 5 == 0) {
                System.out.println(n / 5 + m / 3);
                return;
            } else {
                n -= 3;
                m += 3;
            }

            if (n == 0) {
                System.out.println((n + m) / 3);
                return;
            }
        }
        System.out.println(-1);
    }

}
