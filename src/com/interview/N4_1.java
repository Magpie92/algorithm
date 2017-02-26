package com.interview;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N4_1 {
    public static void main(String[] args) {
        String string = "1234";
        char[] ca = string.toCharArray();
        int num = 0;
        for (char c : ca) {
            num *= 10;
            num += c - '0';
        }
        System.out.println(num);
    }
}
