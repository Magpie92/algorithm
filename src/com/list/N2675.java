package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 9. 5..
 */
public class N2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        for (int i = 0; i < cnt; i++) {
            int num = scanner.nextInt();
            char[] text = scanner.next().toCharArray();
            for (int j = 0; j < text.length; j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(text[j]);
                }
            }
            System.out.println();
        }
    }
}
