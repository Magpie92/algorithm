package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 25..
 */
public class N2751Merge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCnt = scanner.nextInt();
        int[] A = new int[totalCnt];
        int[] temp = new int[totalCnt];
        for (int i = 0; i < totalCnt; i++) {
            A[i] = scanner.nextInt();
        }
        N2751Merge n2751Merge = new N2751Merge();
        n2751Merge.mergeSort(A, temp, 0, A.length - 1);
        for (int num : A) {
            System.out.println(num);
        }

    }

    public void mergeSort(int A[], int temp[], int left, int right) {
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            mergeSort(A, temp, left, mid);
            mergeSort(A, temp, mid + 1, right);
            Merge(A, temp, left, mid + 1, right);
        }


    }

    private void Merge(int A[], int temp[], int left, int mid, int right) {
        int i, left_end, size, temp_pos;
        left_end = mid - 1;
        temp_pos = left;
        size = right - left + 1;
        while ((left <= left_end) && (mid <= right)) {
            if (A[left] <= A[mid]) {
                temp[temp_pos] = A[left];
                temp_pos += 1;
                left += 1;
            } else {
                temp[temp_pos] = A[mid];
                temp_pos += 1;
                mid += 1;
            }
        }
        while (left <= left_end) {
            temp[temp_pos] = A[left];
            temp_pos += 1;
            left += 1;
        }
        while (mid <= right) {
            temp[temp_pos] = A[mid];
            temp_pos += 1;
            mid += 1;
        }

        for (i = 0; i < size; i++) {
            A[right] = temp[right];
            right -= 1;
        }


    }
}
