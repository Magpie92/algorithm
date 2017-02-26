package com.solve;

import java.util.Scanner;

public class Main {
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
