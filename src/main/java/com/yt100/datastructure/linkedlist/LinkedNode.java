package com.yt100.datastructure.linkedlist;

public class LinkedNode {
    int val;
    LinkedNode next;

    public LinkedNode(int val) {
        this.val = val;
    }

    public LinkedNode(int val, LinkedNode next) {
        this.val = val;
        this.next = next;
    }
}
