package com.list;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.next().toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!hashMap.containsKey(array[i])) {
                hashMap.put(array[i], i);
            }
        }

        for (int i = 97; i < 123; i++) {
            if (hashMap.containsKey((char) i)) {
                System.out.print(hashMap.get((char) i));
            } else {
                System.out.print(-1);
            }
            System.out.print(" ");
        }
    }

}
