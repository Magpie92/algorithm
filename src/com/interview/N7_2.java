package com.interview;

import java.util.HashSet;

/**
 * Created by magpiehoon on 2017. 3. 6..
 * single linked list에서 중복 데이터 제거하기.
 */
public class N7_2 {
    private Node head;

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        String str = "[";
        for (Node n = head; n != null; n = n.next) {
            str += n.data;
            str += " ";
        }
        str += "]";
        return str;
    }

    public void removeDuplicates() {
        HashSet<Integer> hashSet = new HashSet<>();
        Node prev = null;
        Node n = head;

        while (n != null) {
            if (hashSet.contains(n.data)) {
                prev.next = n.next;
            } else {
                hashSet.add(n.data);
                prev = n;
            }
            n = n.next;
        }

    }

}
