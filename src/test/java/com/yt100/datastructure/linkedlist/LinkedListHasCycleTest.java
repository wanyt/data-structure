package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListHasCycleTest {

    LinkedListHasCycle linkedListHasCycle = new LinkedListHasCycle();

    @Test
    void nListHasCycleTest() {
        // n个元素的的链表，有环
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(5);
        LinkedNode node6 = new LinkedNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        boolean b = linkedListHasCycle.hasCycle(node1);
        assertTrue(b);
    }

    @Test
    public void nListNoCycleTest() {
        // n个元素的的链表，没有环
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        LinkedNode node5 = new LinkedNode(5);
        LinkedNode node6 = new LinkedNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        boolean b = linkedListHasCycle.hasCycle(node1);
        assertFalse(b);
    }

    @Test
    public void twoListHasCycleTest() {
        // 两个元素的链表，有环
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        node1.next = node2;
        node2.next = node1;

        boolean b = linkedListHasCycle.hasCycle(node1);
        assertTrue(b);
    }

    @Test
    public void twoListNoCycleTest() {
        // 两个元素的链表，没有环
        LinkedNode node1 = new LinkedNode(1);
        node1.next = new LinkedNode(2);

        boolean b = linkedListHasCycle.hasCycle(node1);
        assertFalse(b);
    }

    @Test
    public void oneListTest() {
        // 链表中只有一个节点
        LinkedNode listNode = new LinkedNode(1);
        boolean b = linkedListHasCycle.hasCycle(listNode);
        assertFalse(b);
    }

    @Test
    public void emptyListTest() {
        // 空链表测试
        boolean b = linkedListHasCycle.hasCycle(null);
        assertFalse(b);
    }

}