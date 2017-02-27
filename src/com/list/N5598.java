package com.list;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N5598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < 23; i++) {
            hashMap.put((char) (i + 3 + 'A'), (char) (i + 'A'));
        }
        hashMap.put('A', 'X');
        hashMap.put('B', 'Y');
        hashMap.put('C', 'Z');
        String string = "";
        char[] chars = scanner.next().toCharArray();
        for (char c : chars) {
            string += hashMap.get(c);
        }
        System.out.println(string);
    }

}
