package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N12_3 {
    public static int count(int a, int b) {
        int diff = a ^ b;
        int count = 0;
        while (diff != 0) {
            diff = diff & (diff - 1);
            count++;
        }
        return count;
    }
}
