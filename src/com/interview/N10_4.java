package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 8..
 */
public class N10_4 {
    public static boolean isBst(Node2 root) {
        return isBstRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBstRec(Node2 node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data <= min || node.data > max) {
            return false;
        }

        boolean leftBst = isBstRec(node.left, min, node.data);
        boolean rightBst = isBstRec(node.right, node.data, max);
        return leftBst && rightBst;
    }
}
