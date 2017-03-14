package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 13..
 */
public class ExtraLongFactorials {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInteger);
    }

}
