package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    void get() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int i = myLinkedList.get(5);
        System.out.println("result: " + i);

        createList(myLinkedList);

        int i1 = myLinkedList.get(6);
        System.out.println("result: " + i1);
    }

    @Test
    void addAtHead() {
        MyLinkedList myLinkedList = new MyLinkedList();
        printList(myLinkedList);

        createList(myLinkedList);
        printList(myLinkedList);
    }

    @Test
    void addAtTail() {
        MyLinkedList myLinkedList = new MyLinkedList();
        printList(myLinkedList);

        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtHead(0);
        myLinkedList.addAtHead(-1);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);
        myLinkedList.addAtHead(-2);
        printList(myLinkedList);
        System.out.println();

        int i = myLinkedList.get(-1);
        int i0 = myLinkedList.get(0);
        int i3 = myLinkedList.get(3);
        int i7 = myLinkedList.get(7);
        int i8 = myLinkedList.get(8);
        System.out.println("i: " + i + "; i0: " + i0 + "; i3: " + i3 + "; i7: " + i7 + "; i8: " + i8);
    }

    @Test
    void addAtIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0, 0);
        myLinkedList.addAtIndex(-1, -1);
        myLinkedList.addAtIndex(-2, -2);
        myLinkedList.addAtIndex(-3, -3);

        myLinkedList.addAtIndex(0, -4);

        myLinkedList.addAtIndex(1, 1);
        myLinkedList.addAtIndex(5, 5);

//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtHead(0);
//        printList(myLinkedList);

//        System.out.println();

        myLinkedList.addAtIndex(7, 2);

        printList(myLinkedList);
    }

    @Test
    void deleteAtIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        createList(myLinkedList);
        printList(myLinkedList);
        System.out.println();

        myLinkedList.deleteAtIndex(0);
        myLinkedList.deleteAtIndex(0);
        printList(myLinkedList);
    }

    @Test
    void getHead() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int i = myLinkedList.get(5);
        System.out.println("result: " + i);

        createList(myLinkedList);

        int i1 = myLinkedList.get(6);
        System.out.println("result: " + i1);
    }

    private static void createList(MyLinkedList myLinkedList) {
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(2);
//        myLinkedList.addAtHead(3);
//        myLinkedList.addAtHead(4);
//        myLinkedList.addAtHead(5);
//        myLinkedList.addAtHead(6);
//        myLinkedList.addAtHead(7);
    }

    private static void printList(MyLinkedList linkedList) {
        if (linkedList == null) {
            System.out.println("list is null");
        }

        LinkedNode head = linkedList.getHead();

        if (head == null) System.out.println("list is null");

        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
    }

}