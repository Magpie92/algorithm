package com.solve;

public class Main {
    /*
    * * 읽기 좋은 코드가 좋은 코드 입니다. 읽기 좋은 코드로 작성해 주세요.
    ** 시간 복잡도와 메모리 이슈, 최적의 성능에 중점을 두세요.
    *** 요구 사항이 모호하다면, 그 부분을 재정의하여 서술하고 구현하시오.


    문제 ) A는 해외 여행을 가려하며, 경비로 한화 100만원을 예상한다.
    방문지의 화폐단위는 N이며, 100N, 50N, 20N, 10N, 5N, 1N 의 지폐가 존재한다.

    환전하려는 A의 요구사항은 다음과 같다.
    * 지폐 종류별 1장 이상씩 환전 하었으면 좋겠다.
    * 100N 은 4장, 50N 은 4장만 환전하고 싶다.
    * 1N 은 20장 이상 환전하고 싶다.
    * 20N부터 1N까지 라운드로빈(화폐단위별 순차적으로 1장씩)으로 환전하며, 우리돈 2,000원 이하는 잔돈으로 받고 싶다.
    (특정단위 추가하여 100만원이 넘으면 그 단위 제외하고 다시 라운드로빈)

    100만원으로 환전할 수 있는 화폐의 장수와 환전 후 남은 잔돈을 출력하시오.
    ( 환율은 1N 에 한화 1,322원으로 한다. )


    출력 예)
    100N : 4장
    50N : 4장
    20N : 4장
    10N : 3장
    5N : 4장
    1N : 25장

    잔돈 : 1890원*/
    private static final int N100 = 100;
    private static final int N50 = 50;
    private static final int N20 = 20;
    private static final int N10 = 10;
    private static final int N5 = 5;
    private static final int N1 = 1;
    private static final int exchangeRate = 1322;
    private static final int minN1Numbers = 20;
    private static int totalCost = 1000000;

    public static void main(String[] args) {

    }

    private static boolean limitN1Cost(int exchangeCost) {
        return totalCost - (exchangeRate * exchangeCost) > exchangeRate * minN1Numbers;
    }

    private static boolean decreaseExchangeCost(int exchangeCost) {
        if (limitN1Cost(exchangeCost)) {
            totalCost -= exchangeRate * exchangeCost;
            return true;
        } else {
            return false;
        }
    }

}

