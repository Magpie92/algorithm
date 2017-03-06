package com.interview;

import java.util.Stack;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N7_5 {
    private Node head;

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    public boolean isPalindrome() {
        Node n1 = head;
        Node n2 = head;

        Stack<Integer> s = new Stack<>();

        while (n2 != null && n2.next != null) {
            s.push(n1.data);
            n1 = n1.next;
            n2 = n2.next.next;
        }

        if (n2 != null) {
            n1 = n1.next;
        }

        while (n1 != null) {
            if (s.pop() != n1.data) {
                return false;
            } else {
                n1 = n1.next;
            }
        }
        return true;


    }
}
