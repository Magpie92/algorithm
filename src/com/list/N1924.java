package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 11..
 */
public class N1924 {
    public static void main(String[] args) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < m-1; i++) {
            num += month[i];
        }
        num += d - 1;
        switch (num % 7) {
            case 0:
                System.out.println("MON");
                break;
            case 1:
                System.out.println("TUE");
                break;
            case 2:
                System.out.println("WED");
                break;
            case 3:
                System.out.println("THU");
                break;
            case 4:
                System.out.println("FRI");
                break;
            case 5:
                System.out.println("SAT");
                break;
            case 6:
                System.out.println("SUN");
                break;


        }

    }

}
