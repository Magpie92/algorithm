package com.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 24..
 */
public class N2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCnt = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < totalCnt; i++) {
            numList.add(Integer.parseInt(scanner.nextLine()));
        }

        boolean swapped = true;

        for (int i = numList.size() - 1; i >= 0 && swapped; i--) {
            swapped = false;
            for (int j = 0; j < numList.size() - 1; j++) {
                if (numList.get(j) > numList.get(j + 1)) {
                    int temp = numList.get(j);
                    numList.set(j, numList.get(j + 1));
                    numList.set(j + 1, temp);
                    swapped = true;
                }
            }
        }

        for(int num : numList){
            System.out.println(num);
        }
    }
}
