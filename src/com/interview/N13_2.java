package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N13_2 {
    public static void sort(int[] a) {
        int[] cntArray = new int[150];

        for (int p : a) {
            cntArray[p]++;
        }

        int index = 0;
        for (int i = 0; i < cntArray.length; i++) {
            for (int k = 0; k < cntArray[i]; k++) {
                a[index] = i;
                ++index;
            }
        }
    }
}
