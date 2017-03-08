package com.interview;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N9_1<T> {
    public Queue reverse(Queue<T> q) {
        Stack<T> stack = new Stack<T>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        return q;
    }
}
