package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 6..
 */
public class N7_1 {
    private Node head;

    public void addToHead(int n) {
        Node node = new Node();
        node.data = n;
        node.next = head;
        head = node;
    }

    public void removeFirst() {
        if(head == null){
            throw new RuntimeException("Nothing to remove");
        }
        head = head.next;

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
}
