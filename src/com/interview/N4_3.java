package com.interview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N4_3 {
    public static void main(String[] args) {
        boolean isAnagram = true;
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        if (s1.length() != s2.length()) {
            isAnagram = false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        for (char c : s2.toCharArray()) {
            if (!hm.containsKey(c)) {
                isAnagram = false;
            }
            if (hm.get(c) == 0) {
                isAnagram = false;
            }
            hm.put(c, hm.get(c) - 1);
        }
    }

}
