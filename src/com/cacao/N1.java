package com.cacao;

import java.util.Arrays;

/**
 * Created by magpiehoon on 2017. 9. 16..
 */
public class N1 {
    public static void main(String[] args) {
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        int n = 5;

        int[][] arrInt1 = new int[n][n];
        int[][] arrInt2 = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                arrInt1[i][j] = arr1[i]%2;
                arrInt2[i][j] = arr2[i]%2;
                arr1[i]/=2;
                arr2[i]/=2;
            }
        }

        String[] answer = new String[n];

        for(int i =0; i<n; i++){
            String ans ="";
            for(int j =0; j<n; j++){
                if(arrInt1[i][j]==1 || arrInt2[i][j]==1){
                    ans+="#";
                } else {
                    ans+=" ";
                }
            }
            answer[i] = ans;
        }


        System.out.println(Arrays.toString(answer));
    }
}
