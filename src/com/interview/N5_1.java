package com.interview;

/**
 * Created by magpiehoon on 2017. 2. 28..
 * 주사위로 이동 가능한 경우의 수 모두 구하기
 N칸의 보드게임에서 1~6의 눈금이 있는 주사위를 굴려 갈수 있는 모든 경우의 수를 반환하는 함수 구현
 */
public class N5_1 {
    public static void main(String[] args) {
        System.out.println(countWays(7));
    }

    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return countWays(n - 1) +
                countWays(n - 2) +
                countWays(n - 3) +
                countWays(n - 4) +
                countWays(n - 5) +
                countWays(n - 6);
    }

}
