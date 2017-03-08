package com.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N1158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = 0;
        int m = 0;

        try {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken()) - 1;
        } catch (Exception e) {
            e.printStackTrace();
        }


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        System.out.print("<");
        int cnt = 0;
        while (list.size() != 0) {
            cnt = (cnt + m);
            if (cnt >= list.size()) {
                cnt %= list.size();
            }

            System.out.print(list.remove(cnt));
            if (list.size() > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(">");

    }

}
