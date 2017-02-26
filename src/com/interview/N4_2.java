package com.interview;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        boolean isUnique = true;
        //1. boolean.
        //2. HashSet.

        HashSet<Character> set = new HashSet<>();

        for (char c : string.toCharArray()) {
            if (set.contains(c)) {
                isUnique = false;
            }
            set.add(c);
        }
        System.out.println(isUnique);

    }
}
