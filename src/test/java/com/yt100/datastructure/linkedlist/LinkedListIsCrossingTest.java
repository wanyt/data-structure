package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListIsCrossingTest {

    @Test
    void listCrossing() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedNode node8 = new LinkedNode(8);
        LinkedNode node9 = new LinkedNode(9);
        node8.next = node9;
        node9.next = node4;

        LinkedListIsCrossing linkedListIsCrossing = new LinkedListIsCrossing();
        LinkedNode intersectionNode = linkedListIsCrossing.getIntersectionNode(node1, node8);

        assertEquals(node4, intersectionNode);
    }

    @Test
    void listNoCrossing() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node3 = new LinkedNode(3);
        LinkedNode node4 = new LinkedNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedNode node8 = new LinkedNode(8);
        node8.next = new LinkedNode(9);

        LinkedListIsCrossing linkedListIsCrossing = new LinkedListIsCrossing();
        LinkedNode intersectionNode = linkedListIsCrossing.getIntersectionNode(node1, node8);

        assertNull(intersectionNode);
    }

    @Test
    void listCrossing1() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        node1.next = node2;

        LinkedListIsCrossing linkedListIsCrossing = new LinkedListIsCrossing();
        LinkedNode intersectionNode = linkedListIsCrossing.getIntersectionNode(node1, node2);

        assertEquals(node2, intersectionNode);
    }

    @Test
    void listNoCrossing1() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);

        LinkedListIsCrossing linkedListIsCrossing = new LinkedListIsCrossing();
        LinkedNode intersectionNode = linkedListIsCrossing.getIntersectionNode(node1, node2);

        assertNull(intersectionNode);
    }

}