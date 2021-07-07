package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void reverseList() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedListUtils.printList(node1);
        System.out.println();

        LinkedNode linkedNode = reverseLinkedList.reverseList(node1);
        LinkedListUtils.printList(linkedNode);
        System.out.println();
    }

    @Test
    void reverseList1() {
        LinkedNode node1 = new LinkedNode(1);
        node1.next = new LinkedNode(2);

        LinkedListUtils.printList(node1);
        System.out.println();

        LinkedNode linkedNode = reverseLinkedList.reverseList(node1);
        LinkedListUtils.printList(linkedNode);
        System.out.println();
    }

    @Test
    void reverseList2() {
        LinkedNode node1 = new LinkedNode(1);

        LinkedListUtils.printList(node1);
        System.out.println();

        LinkedNode linkedNode = reverseLinkedList.reverseList(node1);
        LinkedListUtils.printList(linkedNode);
        System.out.println();
    }

    @Test
    void reverseList3() {
        LinkedNode linkedNode = reverseLinkedList.reverseList(null);
        LinkedListUtils.printList(linkedNode);
        System.out.println();
    }

    @Test
    void reverseBetween() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(5);
        LinkedNode node6 = new LinkedNode(6);
        LinkedNode node7 = new LinkedNode(7);
        LinkedNode node8 = new LinkedNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        LinkedListUtils.printList(node1);
        System.out.println();

        LinkedNode linkedNode = reverseLinkedList.reverseBetween(node1, 1, 8);
        LinkedListUtils.printList(linkedNode);
        System.out.println();
    }

    @Test
    void reverseBetween1() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedListUtils.printList(node1);
        System.out.println();

        LinkedNode linkedNode = reverseLinkedList.reverseBetween(node1, 1, 1);
        LinkedListUtils.printList(linkedNode);
        System.out.println();
    }

}