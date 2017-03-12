package com.interview;

import java.util.PriorityQueue;

/**
 * Created by magpiehoon on 2017. 3. 12..
 */
public class N11_2 {
    private PriorityQueue<Integer> q = new PriorityQueue<>();

    public void read(int n) {
        if (q.size() < 10) {
            q.offer(n);
        } else {
            int tenth = q.peek();
            if (n > tenth) {
                q.poll();
                q.offer(n);
            }
        }
    }

    public int[] getTop10() {
        int[] ret = new int[q.size()];
        for (int i = q.size() - 1; i >= 0; i--) {
            ret[i] = q.poll();
        }
        return ret;
    }
}
