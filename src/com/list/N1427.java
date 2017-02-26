package com.list;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 26..
 */
public class N1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            array[i] = num.charAt(i) - '0';
        }
        Arrays.sort(array);
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]);
        }

    }

}
