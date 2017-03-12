package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N14_1 {
    public static int search(int[] data, int target) {
        if (data == null) {
            return -1;
        }

        return searchRec(data, 0, data.length - 1, target);
    }

    private static int searchRec(int[] data, int low, int high, int target) {
        if (low > high || low < 0 || high >= data.length) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (data[mid] == target) {
            return mid;
        } else if (data[mid] < target) {
            return searchRec(data, mid + 1, high, target);
        } else {
            return searchRec(data, low, mid - 1, target);
        }
    }
}
