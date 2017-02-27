package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        char[] ans1 = new char[s1.length()];
        char[] ans2 = new char[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            ans1[i] = s1.charAt(s1.length() - i - 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            ans2[i] = s2.charAt(s2.length() - i - 1);
        }
        int num1 = Integer.parseInt(new String(ans1));
        int num2 = Integer.parseInt(new String(ans2));
        System.out.println(num1 > num2 ? num1 : num2);
    }

}
