package com.nts;

import java.util.HashMap;

import static com.nts.NtsMain.*;

/**
 * Created by magpiehoon on 2017. 5. 24..
 */
public class MoneyExchange {
    private HashMap<Integer, Integer> myN;
    private int totalKoreaWon;
    private int exchangeRate;

    public MoneyExchange(HashMap<Integer, Integer> myN, int totalKoreaWon, int exchangeRate) {
        this.myN = myN;
        this.totalKoreaWon = totalKoreaWon;
        this.exchangeRate = exchangeRate;
    }

    public int getTotalKoreaWon() {
        return totalKoreaWon;
    }

    /**
     * 한화에서 N 으로 환전을 하기위해 구성한 함수입니다.
     * 환전을 원하는 화폐와 장수를 입력받아 환전이 가능하면 한화에서 차감 후 참을 리턴하고
     * 환전이 불가능하면 거짓을 리턴합니다.
     *
     * @param exchangeCost 환전을 원하는 화폐 단위 입니다.
     * @param count        환전을 원하는 화폐 장 수 입니다.
     * @return 정상적으로 희망하는 화폐와 장수로 환전되었을시에 참을 리턴, 그렇지 않을경우 거짓을 리턴합니다.
     */
    public boolean exchangeWonToN(int exchangeCost, int count) {
        if (totalKoreaWon >= exchangeRate * exchangeCost * count) {
            myN.put(exchangeCost, myN.get(exchangeCost) + count);
            totalKoreaWon -= exchangeRate * (exchangeCost * count);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "100N : " + myN.get(N100) + "장\n" +
                "50N : " + myN.get(N50) + "장\n" +
                "20N : " + myN.get(N20) + "장\n" +
                "10N : " + myN.get(N10) + "장\n" +
                "5N : " + myN.get(N5) + "장\n" +
                "1N : " + myN.get(N1) + "장\n\n" +
                "잔돈 : " + totalKoreaWon + "원";
    }
}
