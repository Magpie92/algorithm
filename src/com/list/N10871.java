package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 11..
 */
public class N10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int x = scanner.nextInt();
        int num =0;
        for(int i =0; i<totalCnt; i++){
            num =scanner.nextInt();
            if(num<x){
                System.out.print(num+" ");
            }
        }
    }

}
