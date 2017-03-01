package com.list;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N4673 {
    public static void main(String[] args) {
        ArrayList<Integer> ansList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i + 1);
        }
        int cnt = 1;
        while (true) {
            if (hashSet.size() == 0 || cnt > 10000) {
                break;
            }
            if (hashSet.contains(cnt)) {
                System.out.println(cnt);
                hashSet.remove(cnt);
            }
            int cnt2 = cnt++;
            while (true) {
                char[] ch = String.valueOf(cnt2).toCharArray();
                for (char c : ch) {
                    cnt2 += c - '0';
                }
                if (hashSet.contains(cnt2)) {
                    hashSet.remove(cnt2);
                }
                if (cnt2 > 10000) {
                    break;
                }
            }
        }

    }

}
