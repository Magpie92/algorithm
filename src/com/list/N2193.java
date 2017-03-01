package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 1..
 */
public class N2193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N < 3) {
            System.out.println("1");
        } else {
            long[] arr = new long[N];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < N; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[N - 1]);
        }

    }


//    private static ArrayList<String> pinaryNumber(int n, String string, ArrayList<String> list) {
//        System.out.println(string);
//        if (string.length() == n) {
//            list.add(string);
//            return list;
//        }
//
//        if (string.charAt(string.length() - 1) != '1') {
//            pinaryNumber(n, string + "1", list);
//        }
//        pinaryNumber(n, string + "0", list);
//
//
//        return list;
//    }
}
