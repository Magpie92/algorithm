package com.solve;

import java.util.Scanner;

public class Main {
    public static int ISLAND[][], W, H;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] zombies = {"1","1","0","0","1","1","1","0","0","1","1","0","0","0","0","1"};
        int i, j;
        int totalCnt = sc.nextInt();
        int num = 0;
        W = totalCnt;
        H = totalCnt;
Math.sqrt(zombies.length);

        ISLAND = new int[totalCnt][totalCnt];

        for (i = 0; i < H; i++) {
            for (j = 0; j < W; j++) {
                ISLAND[i][j] = Integer.parseInt(zombies[i * totalCnt + j]);
            }
        }
        for (i = 0; i < H; i++)
            for (j = 0; j < W; j++)
                if (ISLAND[i][j] > 0) {
                    num++;
                    search(i, j);
                }
        System.out.println(num);
    }

    private static void search(int x, int y) {
        ISLAND[x][y] = 0;
        int i, ax[] = {0, 1, 0, -1}, ay[] = {1, 0, -1, 0}, dx, dy;
        for (i = 0; i < 4; i++) {
            dx = x + ax[i];
            dy = y + ay[i];
            if (isInRange(dx, dy) && ISLAND[dx][dy] > 0) search(dx, dy);
        }
    }

    private static boolean isInRange(int x, int y) {
        return (0 <= x && x < H) && (0 <= y && y < W);
    }

}

