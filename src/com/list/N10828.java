package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N10828 {
    private static int[] arr = new int[10000];
    private static int topIndex = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCnt = scanner.nextInt();
        String order;
        for (int i = 0; i < totalCnt; i++) {
            order = scanner.next();
            switch (order) {
                case "push":
                    push(scanner.nextInt());
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;

            }
        }

    }

    private static void push(int n) {
        topIndex++;
        arr[topIndex] = n;
    }

    private static int pop() {
        if (topIndex == -1) {
            System.out.println(-1);
        } else {
            System.out.println(arr[topIndex]);
            arr[topIndex] = 0;
            topIndex--;
        }
        return 0;
    }

    private static void size() {
        System.out.println(topIndex+1);
    }

    private static void empty() {
        if (topIndex == -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void top() {
        if (topIndex == -1) {
            System.out.println(-1);
        } else {
            System.out.println(arr[topIndex]);
        }
    }
}
