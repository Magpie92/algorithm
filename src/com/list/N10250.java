package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 26..
 */
public class N10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int h, w, n;
        int x, y;
        String roomNum;
        for (int i = 0; i < totalCnt; i++) {
            h = scanner.nextInt();
            w = scanner.nextInt();
            n = scanner.nextInt();
            x = (n - 1) % h + 1;
            y = (n - 1) / h + 1;
            if (y < 10) {
                roomNum = String.valueOf(x) + "0" + y;
            } else {
                roomNum = String.valueOf(x) + y;
            }
            System.out.println(roomNum);
        }


    }
}
