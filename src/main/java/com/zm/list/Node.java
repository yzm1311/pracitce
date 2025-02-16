package com.zm.list;

public class Node {

    public Object data;
    public Node next;

    public Object getData() {
        return data;
    }

    public Node(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
