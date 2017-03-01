package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 28..
 */
public class N4811 {
    public static long cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCnt = 0;
        while (true) {
            numCnt = scanner.nextInt();
            if (numCnt == 0) {
                return;
            }
            String s = "W";
            alyak(numCnt - 1, numCnt, s, numCnt * 2);
            System.out.println(cnt);
            cnt = 0;
        }
    }

    private static void alyak(int W, int H, String string, int n) {

        if (W > H) {
            return;
        }
        if (W < 0 || H < 0) {
            return;
        }
        if (W == 0 && H == 0) {
            cnt++;
            return;
        }

        alyak(W - 1, H, string + "W", n);
        alyak(W, H - 1, string + "H", n);

    }
    //카탈란 수
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numCnt = 0;
//        long catalan = 1;
//        long[] numArray = new long[30];
//        for (long i = 1; i <= 30; i++) {
//            catalan = catalan * (4 * i - 2) / (i + 1);
//            numArray[(int) i - 1] = catalan;
//        }
//
//        while (true) {
//            numCnt = scanner.nextInt();
//            if (numCnt == 0) {
//                return;
//            }
//            System.out.println(numArray[numCnt - 1]);
//        }
//
//
//    }

}
