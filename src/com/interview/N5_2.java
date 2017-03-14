package com.interview;

/**
 * Created by magpiehoon on 2017. 2. 28..
 * 이미지에서 닫힌 영역 단색 칠하는 함수 구현하기
 * 그림판 프로그램의 영역 칠하기 기능을 생각하면 이해에 도움이 될 것이다.
 * 매개변수중 x, y를 색을 칠하기 시작하는 위치이다.
 * x, y 위치의 색과 같은 색만 칠한다.
 * "newC"는 새로 칠할 색상의 값이다.
 */
public class N5_2 {
    public static void main(String[] args) {

    }

//    public static void paintRec(int[][] image, int x, int y, int newC, int target) {
//        if (y < 0 || x < 0 || y >= image.length || x >= image[0].length) {
//            return;
//        }
//        if (image[y][x] == newC || image[y][x] != target) {
//            return;
//        }
//        image[y][x] = newC;
//        paintRec(image, x + 1, y, newC, target);
//        paintRec(image, x, y + 1, newC, target);
//        paintRec(image, x - 1, y, newC, target);
//        paintRec(image, x, y - 1, newC, target);
//
//    }
}
