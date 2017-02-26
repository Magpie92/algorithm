package com.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 26..
 */
public class N2960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        int p, deleteNum;
        int cnt = 0;
        n = scanner.nextInt();
        k = scanner.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            numList.add(i + 1);
        }

        while (true) {
            p = numList.remove(0);
            if (k == ++cnt) {
                System.out.println(p);
            }
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) % p == 0) {
                    deleteNum = numList.remove(i);
                    if (k == ++cnt) {
                        System.out.println(deleteNum);
                    }
                }
            }
            if (numList.size() == 0) {
                break;
            }

        }
    }

}
