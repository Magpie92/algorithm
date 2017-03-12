package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N12_2 {
    public static boolean isPowerOf2(int i) {
        return (i & (i - 1)) == 0;
    }
}
