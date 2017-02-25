package com.falut;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 2. 25..
 */
public class N9426 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, totalCnt, sum = 0;
        num = scanner.nextInt();
        totalCnt = scanner.nextInt();
        int[] numArray = new int[num];
        int[] array = new int[totalCnt];
        int[] arrayTemp = new int[totalCnt];

        for (int i = 0; i < num; i++) {
            numArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < num - totalCnt + 1; i++) {
            for (int j = 0; j < totalCnt; j++) {
                array[j] = numArray[i + j];
            }
            N9426 main = new N9426();
            main.mergeSort(array, arrayTemp, 0, totalCnt - 1);
            sum += array[((totalCnt + 1) / 2) - 1];
        }
        System.out.println(sum);

    }

    private void mergeSort(int A[], int temp[], int left, int right) {
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
