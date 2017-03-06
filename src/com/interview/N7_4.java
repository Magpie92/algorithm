package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 6..
 * single linked list에서 뒤에서 k번째 원소를 반환하는 함수를 구현한다.
 */
public class N7_4 {
    private Node head;

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    public Node kthToLast(int k) {
        if (k <= 0) {
            return null;
        }
        Node n1 = head;
        Node n2 = head;

        for (int i = 0; i < k; i++) {
            if (n2 == null) {
                return null;
            }
            n2 = n2.next;
        }
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n1;
    }
}
