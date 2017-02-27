package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N2864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr1 = scanner.next().toCharArray();
        char[] arr2 = scanner.next().toCharArray();
        int max1 = 0, min1 = 0;
        for (char c : arr1) {
            max1 *= 10;
            min1 *= 10;
            if (c - '0' == 5 || c - '0' == 6) {
                max1 += 6;
                min1 += 5;
            } else {
                max1 += c - '0';
                min1 += c - '0';
            }
        }
        int max2 = 0, min2 = 0;
        for (char c : arr2) {
            max2 *= 10;
            min2 *= 10;
            if (c - '0' == 5 || c - '0' == 6) {
                max2 += 6;
                min2 += 5;
            } else {
                max2 += c - '0';
                min2 += c - '0';
            }
        }
        System.out.println((min1 + min2)+ " " + (max1 + max2));
    }

}
