package com.interview;


/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N14_3 {
    public static Position search(int[][] m, int target) {
        int row = m.length - 1;
        int col = 0;

        while (row >= 0 && col < m[0].length) {
            if (m[row][col] == target) {
                return new Position(row, col);
            } else if (m[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }
        return null;

    }
}
