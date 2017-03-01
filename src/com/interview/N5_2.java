package com.interview;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N5_2 {
    public static void main(String[] args) {

    }

    public static void paintRec(int[][] image, int x, int y, int newC, int target) {
        if (y < 0 || x < 0 || y >= image.length || x >= image[0].length) {
            return;
        }
        if (image[y][x] == newC || image[y][x] != target) {
            return;
        }
        image[y][x] = newC;
        paintRec(image, x + 1, y, newC, target);
        paintRec(image, x, y + 1, newC, target);
        paintRec(image, x - 1, y, newC, target);
        paintRec(image, x, y - 1, newC, target);

    }
}
