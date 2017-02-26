package com.falut;

/**
 * Created by magpiehoon on 2017. 2. 26..
 */
public class N6064 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int totalCnt = scanner.nextInt();
//
//        for (int i = 0; i < totalCnt; i++) {
//            int m, n, x, y, dumX = 1, dumY = 1, cnt = 0;
//            m = scanner.nextInt();
//            n = scanner.nextInt();
//            x = scanner.nextInt();
//            y = scanner.nextInt();
//            int max, min;
//            if (m > n) {
//                max = m;
//                min = n;
//            } else {
//                max = n;
//                min = m;
//            }
//
//            Main main = new Main();
//            while (cnt < max * min / main.gcd(max,min)) {
//                if (dumX == m && dumY == n) {
//                    cnt++;
//                    if (dumX == x && dumY == y) {
//                        System.out.println(cnt);
//                    } else {
//                        System.out.println(-1);
//                    }
//                    break;
//                } else {
//                    cnt++;
//                    if (dumX == x && dumY == y) {
//                        System.out.println(cnt);
//                        break;
//                    }
//                    if (dumX < m) {
//                        dumX++;
//                    } else {
//                        dumX = 1;
//                    }
//                    if (dumY < n) {
//                        dumY++;
//                    } else {
//                        dumY = 1;
//
//                    }
//                }
//            }
//        }


    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
