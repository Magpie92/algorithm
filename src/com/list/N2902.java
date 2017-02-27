package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N2902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.next().split("-");
        for(String s : strings){

            System.out.print(s.charAt(0));
        }
    }

}
