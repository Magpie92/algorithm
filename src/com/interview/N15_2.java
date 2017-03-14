package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 13..
 */
public class N15_2 {
    public static void swap(int i, int k, int[] a) {
        a[i] = a[k] - a[i];
        a[k] = a[k] - a[i];
        a[i] = a[k] + a[i];
    }
}
