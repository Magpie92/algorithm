package com.cacao;

import java.util.ArrayList;

/**
 * Created by magpiehoon on 2017. 9. 16..
 */
public class N33 {
    public static void main(String[] args) {
        int answer = 0;
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {


            if (arrayList.contains(cities[i].toLowerCase())) {
                arrayList.remove(cities[i].toLowerCase());
                answer += 1;
            } else {
                if (arrayList.size() == cacheSize && arrayList.size() > 0) {
                    arrayList.remove(0);
                }
                answer += 5;
            }

            if (arrayList.size() < cacheSize) {
                arrayList.add(cities[i].toLowerCase());
            }
        }
        System.out.println(answer);
    }
}
