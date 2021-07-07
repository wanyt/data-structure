package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSortTest {

    OddEvenSort oddEvenSort = new OddEvenSort();

    @Test
    void oddEvenList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        LinkedListUtils.printList(node1);
        ListNode listNode = oddEvenSort.oddEvenList(node1);
        LinkedListUtils.printList(listNode);
    }

    @Test
    void oddEvenList5() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListUtils.printList(node1);
        ListNode listNode = oddEvenSort.oddEvenList(node1);
        LinkedListUtils.printList(listNode);
    }

    @Test
    void oddEvenList1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedListUtils.printList(node1);
        ListNode listNode = oddEvenSort.oddEvenList(node1);
        LinkedListUtils.printList(listNode);
    }

    @Test
    void oddEvenList2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        LinkedListUtils.printList(node1);
        ListNode listNode = oddEvenSort.oddEvenList(node1);
        LinkedListUtils.printList(listNode);
    }

    @Test
    void oddEvenList3() {
        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        node1.next = node2;

        LinkedListUtils.printList(node1);
        ListNode listNode = oddEvenSort.oddEvenList(node1);
        LinkedListUtils.printList(listNode);
    }

    @Test
    void oddEvenList4() {
        ListNode listNode = oddEvenSort.oddEvenList(null);
        LinkedListUtils.printList(listNode);
    }

}