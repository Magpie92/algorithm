package com.interview;

import java.util.Stack;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N9_2<T> {
    Stack<T> stack1;
    Stack<T> stack2;

    public N9_2() {
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
    }

    public void offer(T element) {
        stack1.push(element);
    }

    public T poll() {
        if(stack2.isEmpty()){
            while(stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }
}
