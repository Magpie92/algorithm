package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 11..
 */
public class N2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();
        int[] arr = new int[10];
        while (num != 0) {
            arr[((int) num % 10)] += 1;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

}
