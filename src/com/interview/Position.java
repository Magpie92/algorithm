package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class Position {
    int row;
    int col;

    public Position() {

    }

    public Position(int r, int c) {
        row = r;
        col = c;
    }

    @Override
    public String toString() {
        return row + ", " + col;
    }
}
