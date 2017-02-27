package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.next().toCharArray();
        int[] numArray = new int[26];
        for (char c : array) {
            if ((int) c < 91) {
                numArray[c - 'A']++;
            } else {
                numArray[c - 'a']++;
            }
        }
        int ans = 0;
        int token = 0;
        int num=0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > ans) {
                ans = numArray[i];
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            if (ans == numArray[i]) {
                token++;
                num=i;
            }
        }
        if (token == 1) {
            System.out.println((char) (num + 'A'));
        } else {
            System.out.println("?");
        }
    }

}
