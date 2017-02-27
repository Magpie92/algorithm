package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N9933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        String[] strings = new String[totalCnt];
        char[] ch1, ch2;

        for (int i = 0; i < totalCnt; i++) {
            strings[i] = scanner.next();
        }

        for (int i = 0; i < strings.length; i++) {
            String reverse = "";
            ch1 = strings[i].toCharArray();

            for (int j = ch1.length - 1; j >= 0; j--) {
                reverse += ch1[j];
            }
            for (int j = 0; j < strings.length; j++) {
                if (reverse.equals(strings[j])) {
                    System.out.println(reverse.length() + " " + reverse.charAt(reverse.length() / 2));
                    return;
                }
            }

        }
    }

}
