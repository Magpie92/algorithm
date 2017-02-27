package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N1100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] line = new char[8];
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            line = scanner.nextLine().toCharArray();
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0 && line[j] == 'F') {
                    cnt++;
                } else if (i % 2 == 1 && j % 2 == 1 && line[j] == 'F') {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
