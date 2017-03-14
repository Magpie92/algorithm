package com.interview;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 * Run Length Coding 으로 문자열 압축하기
 * (글자+반복수)로 압축한다.
 * 예: "aaabbcccc" -> "a3b2c4"
 */
public class N4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String result = "";
        char[] ca = string.toCharArray();
        char ch = ca[0];
        int count = 1;
        for (int i = 1; i < ca.length; i++) {
            if (ch == ca[i]) {
                count++;
            } else {
                result = result + ch + count;
                ch = ca[i];
                count = 1;
            }
        }
        result = result + ch + count;
        System.out.println(result);
    }

}
