package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 6..
 * single linked list 뒤집기
 */
public class N7_3 {
    private Node head;

    public void reverse() {
        Node oldHead = head;
        head = null;

        for (Node n = oldHead; n != null; n = n.next) {
            addToHead(n.data);
        }
    }

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }
}
