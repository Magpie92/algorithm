package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 8..
 */
public class N10_1 {
    public static int getMax(Node2 root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = getMax(root.left);
        int rightMax = getMax(root.right);
        int childMax = Math.max(leftMax, rightMax);
        return Math.max(childMax, root.data);

    }

}
