package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 9. 1..
 */
public class N2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = num;
        int min = Integer.MAX_VALUE, sum = 0, con;
        while (num > 0) {
            con = num;
            sum = num;

            while (con > 0) {
                sum += con % 10;
                con /= 10;
            }

            if (sum == ans && num < min) {
                min = num;
            }
            num--;
        }
        if(min == Integer.MAX_VALUE){
            System.out.println(0);
        }else {
            System.out.println(min);
        }
    }
}
