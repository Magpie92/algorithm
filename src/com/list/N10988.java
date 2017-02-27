package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.next().toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i]!= array[array.length-i-1]){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }

}
