package com.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by magpiehoon on 2017. 3. 7..
 */
public class N8_2<T> {
    private List<T> list;

    public N8_2() {
        list = new ArrayList<T>();
    }

    public void push(T i) {
        list.add(i);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }
}
