package com.solve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1001];
        arr[0] = 10;
        arr[1] = 55;
        for (int i = 2; i < 1001; i++) {
            arr[i] = (arr[i - 1] - arr[i - 2]) + (arr[i - 1] * 2 + arr[i - 2]) % 10007+arr[i-1];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(arr[scanner.nextInt() - 1]);
    }
}
