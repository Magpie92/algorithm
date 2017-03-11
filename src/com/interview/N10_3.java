package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 8..
 */
public class N10_3 {
    public static Node2 build(int[] a) {
        return buildRec(a, 0, a.length);
    }

    private static Node2 buildRec(int[] a, int l, int h) {
        if (l > h) {
            return null;
        }
        int m = (l + h) / 2;

        Node2 left = buildRec(a, l, m - 1);
        Node2 right = buildRec(a, m + 1, h);

        return new Node2(a[m], left, right);
    }
}
