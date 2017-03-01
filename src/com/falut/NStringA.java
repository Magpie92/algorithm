package com.falut;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class NStringA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        int totalCnt = scanner.nextInt();
        for (int i = 0; i < totalCnt; i++) {
            int num = scanner.nextInt();
            int cnt = 0;
            for (int j = 0; j < num; j++) {
                if (chars[chars.length - 1 - j] == chars[num - 1 - j]) {
                    cnt++;
                } else {
                    break;
                }
            }
            System.out.println(cnt);

        }
    }

}
