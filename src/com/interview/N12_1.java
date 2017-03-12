package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N12_1 {
    public static boolean get(int n, int i) {
        int mask = 1 << i;
        return (n & mask) != 0;
    }

    public static int set(int n, int i) {
        int mask = 1 << i;
        return n | mask;

    }

    public static int clear(int n, int i) {
        int mask = -(1 << i);
        return n & mask;
    }
}
