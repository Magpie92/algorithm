package com.solve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        for (int i = 3; i < 11; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        Scanner scanner = new Scanner(System.in);
        int totalInt = scanner.nextInt();
        for(int i =0; i<totalInt;i++){
            System.out.println(arr[scanner.nextInt()-1]);
        }

    }
}
