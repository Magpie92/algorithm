package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N14_2 {
    public int[] cache;

    public N14_2() {
        cache = new int[(10 * 1000 * 1000) / 32];
    }

    public void store(String phoneNumber) {
        int phoneInt = Integer.parseInt(phoneNumber);
        int arrayIndex = phoneInt / 32;
        int byteIndex = phoneInt % 32;
        cache[arrayIndex] = cache[arrayIndex] | (1 << byteIndex);
    }

    public boolean exist(String phoneNumber) {
        int phoneInt = Integer.parseInt(phoneNumber);
        int arrayIndex = phoneInt / 32;
        int byteIndex = phoneInt % 32;
        return (cache[arrayIndex] & (1 << byteIndex)) != 0;
    }
}
