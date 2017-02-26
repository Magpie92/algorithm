package com.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 26..
 */
public class N1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1000, p, cnt = 0, num;
        int totalCnt = scanner.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> primaryList = new ArrayList<>();


        for (int i = 1; i < n; i++) {
            numList.add(i + 1);
        }

        while (true) {
            p = numList.remove(0);
            primaryList.add(p);
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) % p == 0) {
                    numList.remove(i);
                }
            }
            if (numList.size() == 0) {
                break;
            }

        }

        for (int i = 0; i < totalCnt; i++) {
            num = scanner.nextInt();
            for (int j = 0; j < primaryList.size(); j++) {
                if (num == primaryList.get(j)) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);

    }

}
