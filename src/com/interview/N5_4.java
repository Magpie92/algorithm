package com.interview;

import java.util.ArrayList;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N5_4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = permRec("123", new boolean["123".length()], "", new ArrayList<>());
    }

    public static ArrayList<String> permRec(String s,
                                            boolean[] pick,
                                            String perm,
                                            ArrayList<String> result) {

        if (perm.length() == s.length()) {
            result.add(perm);
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            if (pick[i]) {
                continue;
            }
            pick[i] = true;
            permRec(s, pick, perm + s.charAt(i), result);
            pick[i] = false;
        }
        return result;
    }
}
