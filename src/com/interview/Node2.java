package com.interview;

/**
 * Created by magpiehoon on 2017. 3. 8..
 */
public class Node2 {
    int data;
    Node2 left;
    Node2 right;

    public Node2(){

    }
    public Node2(int n){
        data = n;
    }

    public Node2(int data, Node2 left, Node2 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
