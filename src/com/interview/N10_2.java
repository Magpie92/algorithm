package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 8..
 */
public class N10_2 {
    public static boolean isBalanced(Node2 root) {
        return isBalanceHelper(root) != -1;
    }

    private static int isBalanceHelper(Node2 n) {
        if (n == null) {
            return 0;
        }
        int l = isBalanceHelper(n.left);
        if (l == -1) {
            return -1;
        }
        int r = isBalanceHelper(n.right);
        if (r == -1) {
            return -1;
        }

        int diff = Math.abs(r - l);
        if (diff > 1) {
            return -1;
        }
        return Math.max(l, r) + 1;
    }
}
