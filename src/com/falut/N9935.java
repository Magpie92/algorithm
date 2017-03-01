package com.falut;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N9935 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String boom = scanner.next();
        while (string.contains(boom)) {
            string = string.replace(boom, "");
        }
        if (string.equals("")) {
            System.out.println("FRULA");
        } else {
            System.out.println(string);
        }
    }

}
