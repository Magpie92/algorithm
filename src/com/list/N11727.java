package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 3..
 */
public class N11727 {
    public static void main(String[] args) {
        long[] arr = new long[1000];
        arr[0] = 1;
        arr[1] = 3;
        for (int i = 2; i < 1000; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2] * 2) % 10007;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(arr[scanner.nextInt() - 1]);
    }
}
