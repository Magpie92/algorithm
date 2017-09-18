package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 8. 18..
 */
public class N1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 99;

        if (num < 100) {
            System.out.println(num);
        } else {
            for (int i = 1; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (i * 100 + j * 10 + k >= num || i * 100 + j * 10 + k + 1 == 1000) {
                            System.out.println(cnt);
                            return;
                        }
                        if (i - j == j - k) {
                            cnt++;
                        }
                    }
                }
            }
        }

    }
}
