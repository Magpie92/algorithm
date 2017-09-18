package com.cacao;

/**
 * Created by magpiehoon on 2017. 9. 16..
 */
public class n2 {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        char[] da = dartResult.toCharArray();
        int[] ans = new int[3];
        int cnt = 0;
        for (int i = 0; i < da.length; i++) {
            if (da[i] - '0' >= 0 && da[i] - '0' < 10) {
                ans[cnt] = da[i] - '0';
                if (da[i] - '0' == 1 && da[i + 1] - '0' == 0) {
                    i++;
                    ans[cnt] = 10;
                }
            }

            if (da[i] == 'T') {
                ans[cnt] *= 3;
            }
            if (da[i] == 'D') {
                ans[cnt] *= 2;
            }

            if(i != da.length-1 && da[i+1]==)


        }
    }
}
