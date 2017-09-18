package com.cacao;

/**
 * Created by magpiehoon on 2017. 9. 16..
 */
public class N3 {
    public static void main(String[] args) {
        int cacheSize = 0;
        String[] cities
                = {"a", "b", "c", "d", "e","f"};


        if (cacheSize == 0) {                       
            System.out.println(cities.length * 5);
            return;
        }

        int answer;
        String[] chStr = new String[cacheSize];
        int[] chInt = new int[cacheSize];
        if (cacheSize < cities.length) {
            answer = cacheSize * 5;
            for (int i = 0; i < cacheSize; i++) {
                chStr[i] = cities[i];
                chInt[i] = i;
            }
        } else {
             answer = cities.length * 5;
             for (int i = 0; i < cities.length; i++) {
                 chStr[i] = cities[i];
                 chInt[i] = i;
        }    }


        for (int i = cacheSize; i < cities.length; i++) {
            int page = 0;
            for (int j = 0; j < cacheSize; j++) {
                if (cities[i].equalsIgnoreCase(chStr[j])) {
                    answer++;
                    page = 1;
                    System.out.println("hit");
                    break;
                }
            }
            if (page == 0) {
                int min = 100001;
                int minCnt = 0;
                for (int k = 0; k < cacheSize; k++) {
                    if (chInt[k] < min) {
                        min = chInt[k];
                        minCnt = k;
                    }
                }
                chStr[minCnt] = cities[i];
                chInt[minCnt] = i;
                answer += 5;
                System.out.println("miss");

            }
            System.out.println(cities[i]);
            for (int j = 0; j < cacheSize; j++) {
                System.out.print(chStr[j] + " " + chInt[j] + " ");
            }
            System.out.println();

        }
        System.out.println(answer);
    }

}
