package com.list;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.next().toCharArray();
        int[] ans = new int[26];
        Arrays.fill(ans, 0);
        for (char c : array) {
            ans[c - 'a']++;
        }
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }

}
