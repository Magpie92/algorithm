package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 13..
 */
public class N15_1 {
    public static int getDayOfWeek(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        for (int i = 1; i < month; i++) {
            count += daysInMonth[i];
        }
        count += day;
        count += 5;
        return count % 7;
    }
}
