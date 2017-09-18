package com.nts;

import java.util.HashMap;

/**
 * Created by magpiehoon on 2017. 6. 10..
 */
public class NtsMain {

    public static final int N100 = 100;
    public static final int N50 = 50;
    public static final int N20 = 20;
    public static final int N10 = 10;
    public static final int N5 = 5;
    public static final int N1 = 1;
    private static final int BASIC_EXCHANGE_CNT = 1;
    private static final int HOPE_MIN_N100_CNT = 4;
    private static final int HOPE_MIN_N50_CNT = 4;
    private static final int HOPE_MIN_N1_CNT = 20;
    private static final int HOPE_MIN_CHANGE = 2000;
    private static final int EXCHANGE_RATE = 1322;

    public static void main(String[] args) {
        int totalKoreaWon = 1000000;
        HashMap<Integer, Integer> myN = new HashMap<>();
        myN.put(N100, 0);
        myN.put(N50, 0);
        myN.put(N20, 0);
        myN.put(N10, 0);
        myN.put(N5, 0);
        myN.put(N1, 0);
        MoneyExchange moneyExchange = new MoneyExchange(myN, totalKoreaWon, EXCHANGE_RATE);

        //N100을 4장 환전합니다. 환전 불가능할시 요구사항을 충족하지 못 하므로 종료합니다.
        if (!moneyExchange.exchangeWonToN(N100, HOPE_MIN_N100_CNT)) {
            return;
        }
        //N50을 4장 환전합니다. 환전 불가능할시 요구사항을 충족하지 못 하므로 종료합니다.
        if (!moneyExchange.exchangeWonToN(N50, HOPE_MIN_N50_CNT)) {
            return;
        }
        //N1을 20장 이상 환전하길 희망하기 때문에 N1을 20장 먼저 환전합니다. 환전 불가능할시 요구사항을 충족하지 못 하므로 종료합니다.
        if (!moneyExchange.exchangeWonToN(N1, HOPE_MIN_N1_CNT)) {
            return;
        }
        totalKoreaWon = moneyExchange.getTotalKoreaWon();

        // 라운드로빈으로 N20 부터 N1까지 화폐를 환전합니다.
        while (totalKoreaWon > HOPE_MIN_CHANGE) {
            moneyExchange.exchangeWonToN(N20, BASIC_EXCHANGE_CNT);
            moneyExchange.exchangeWonToN(N10, BASIC_EXCHANGE_CNT);
            moneyExchange.exchangeWonToN(N5, BASIC_EXCHANGE_CNT);
            moneyExchange.exchangeWonToN(N1, BASIC_EXCHANGE_CNT);
            totalKoreaWon = moneyExchange.getTotalKoreaWon();
        }
        System.out.println(moneyExchange.toString());
    }

}
