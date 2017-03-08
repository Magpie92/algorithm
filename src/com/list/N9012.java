package com.list;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();

        for (int i = 0; i < totalCnt; i++) {
            boolean isVPS = true;
            char[] arr = scanner.next().toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '(') {
                    stack.push('(');
                } else if (arr[j] == ')') {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.isEmpty() && isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
