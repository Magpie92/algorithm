package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 11..
 */
public class N9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<60){
            System.out.println("F");
        } else if (num<70){
            System.out.println("D");
        } else if(num<80){
            System.out.println("C");
        } else if(num<90){
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }

}
