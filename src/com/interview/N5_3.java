package com.interview;

import java.util.ArrayList;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N5_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = bitCombRec(10, "", new ArrayList<>());
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> bitCombRec(int n, String s, ArrayList<String> list) {
        if (n == s.length()) {
            list.add(s);
            return list;
        }
        bitCombRec(n, s + "0", list);
        bitCombRec(n, s + "1", list);
        return list;
    }

}
