package com.interview;

import java.util.Stack;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N8_4 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public N8_4() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int newVal) {
        if (minStack.isEmpty() || newVal <= minStack.peek()) {
            minStack.push(newVal);
        }
        stack.push(newVal);
    }

    public int pop() {
        int val = stack.pop();
        if (!minStack.isEmpty() && val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return 0;
        }
        return minStack.peek();
    }
}
