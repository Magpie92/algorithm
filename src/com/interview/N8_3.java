package com.interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N8_3 {
    public boolean isPalindrome(String s) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len / 2; i++) {
            stack.push(s.charAt(i));
        }

        for (int i = (len + 1) / 2; i < len; i++) {
            if (stack.pop() != s.charAt(i)) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
