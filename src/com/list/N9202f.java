package com.list;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 8. 10..
 */
public class N9202f {
    static int dx[] = {-1, -1, -1, 1, 1, 1, 0, 0};
    static int dy[] = {-1, 0, 1, -1, 0, 1, -1, 1};

    static char[][] board = new char[4][4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wordsCnt = scanner.nextInt();
        String[] words = new String[wordsCnt];
        for (int i = 0; i < wordsCnt; i++) {
            words[i] = scanner.next();
        }

        int mapCnt = scanner.nextInt();
        int maxScore = 0, searchCnt = 0;
        String MaxLongWord = "";

        for (int j = 0; j < mapCnt; j++) {
            for (int i = 0; i < 4; i++) {
                board[i] = scanner.next().toCharArray();
            }
            String[] wordsCopy = words.clone();

            for (int i = 0; i < wordsCnt; i++) {
                int[][] visit = new int[4][4];
                for (int m = 0; m < 4; m++) {
                    for (int n = 0; n < 4; n++) {
//                        visit[m][n]++;
                        if (!wordsCopy[i].equals("") && hasWord(m, n, wordsCopy[i], visit)) {
                            int wordLength = wordsCopy[i].length();
                            if (wordLength > MaxLongWord.length()) {
                                MaxLongWord = wordsCopy[i];
                            } else if (wordLength == MaxLongWord.length()) {
                                if (MaxLongWord.compareTo(wordsCopy[i]) > 0) {
                                    MaxLongWord = wordsCopy[i];
                                }
                            }
                            wordsCopy[i] = "";
                            switch (wordLength) {
                                case 8:
                                    maxScore += 11;
                                    break;
                                case 7:
                                    maxScore += 5;
                                    break;
                                case 6:
                                    maxScore += 3;
                                    break;
                                case 5:
                                    maxScore += 2;
                                    break;
                                case 4:
                                    maxScore += 1;
                                    break;
                                case 3:
                                    maxScore += 1;
                                    break;
                            }
                            searchCnt++;
                        }
                    }
                }


            }

            System.out.println(maxScore + " " + MaxLongWord + " " + searchCnt);
            maxScore = 0;
            searchCnt = 0;
            MaxLongWord = "";
        }
    }

    public static boolean hasWord(int x, int y, String word, int[][] visit) {

        if (inRange(x, y)) {
            return false;
        }

        if (board[x][y] != word.charAt(0)) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }


        for (int i = 0; i < 8; i++) {
            int nextY = y + dy[i], nextX = x + dx[i];
            //비짓 더하는 위치 수정
            if (visit[x][y] > 0) {
                return false;
            } else {
                visit[x][y]++;
            }
            if (hasWord(nextX, nextY, word.substring(1), visit)) {

                return true;
            }
        }

        return false;

    }

    public static boolean inRange(int x, int y) {
        return x < 0 || y < 0 || x > 3 || y > 3;
    }
}
