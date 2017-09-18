package com.list;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 8. 18..
 */
public class N2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] high = new int[9];
        int max = 0;
        for (int i = 0; i < 9; i++) {
            high[i] = sc.nextInt();
            max += high[i];
        }

        Arrays.sort(high);
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (max - high[i] - high[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(high[k]);
                        }
                    }
                    break;
                }
            }
        }

    }
}
