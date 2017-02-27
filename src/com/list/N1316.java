package com.list;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 27..
 */
public class N1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int totalAns = 0;
        for (int i = 0; i < totalCnt; i++) {
            char[] chars = scanner.next().toCharArray();
            char pre = chars[0];
            boolean isGroup = true;
            HashSet<Character> hashSet = new HashSet<>();
            hashSet.add(chars[0]);
            for (int j = 1; j < chars.length; j++) {
                if (chars[j - 1] != chars[j]) {
                    if (hashSet.contains(chars[j])) {
                        isGroup = false;
                        break;
                    } else {
                        hashSet.add(chars[j]);
                    }
                }
            }

            if(isGroup){
                totalAns++;
            }
        }
        System.out.println(totalAns);
    }

}
