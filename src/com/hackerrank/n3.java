package com.hackerrank;

/**
 * Created by magpiehoon on 2017. 3. 13..
 */
public class n3 {
    public static void main(String[] args) {
        String[] s = {"vpllamwr", "kfa", "hffv","zycfjuvrhxf","fdjsqlgmcux"};
        int[] ans = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            char[] ch = s[i].toCharArray();
            int cnt = 0;
            for (int k = 0; k < ch.length / 2; k++) {
                if (ch[k] != ch[ch.length - k - 1]) {
                    int l = ch[k] - '0';
                    int r = ch[ch.length - k - 1] - '0';
                    if (l > r) {
                        while (l != r) {
                            l--;
                            cnt++;
                        }
                    } else {
                        while (l != r) {
                            r--;
                            cnt++;
                        }
                    }
                }
            }
            ans[i] = cnt;
        }
    }

}
