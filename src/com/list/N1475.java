package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 26..
 */
public class N1475 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomNum = scanner.next();
        int num, cnt;
        int[] A = new int[9];
        for (int i = 0; i < roomNum.length(); i++) {
            num = roomNum.charAt(i) - '0';
            switch (num) {
                case 0:
                    A[0]++;
                    break;
                case 1:
                    A[1]++;
                    break;
                case 2:
                    A[2]++;
                    break;
                case 3:
                    A[3]++;
                    break;
                case 4:
                    A[4]++;
                    break;
                case 5:
                    A[5]++;
                    break;
                case 7:
                    A[6]++;
                    break;
                case 8:
                    A[7]++;
                    break;
                case 6:
                case 9:
                    A[8]++;
                    break;
            }
        }
        A[8] = (A[8] / 2) + (A[8] % 2);
        cnt = A[0];
        for (int j = 1; j < 9; j++) {
            if (cnt < A[j]) {
                cnt = A[j];
            }
        }

        System.out.println(cnt);
    }
}
