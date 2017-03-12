package com.interview;

import java.util.PriorityQueue;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N11_1 {
    public static void sort(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int e : a) {
            q.add(e);
        }

        for (int k = 0; k < a.length; k++) {
            a[k] = q.poll();
        }

    }
}
