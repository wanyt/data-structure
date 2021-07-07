package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelLinkedListElementTest {

    DelLinkedListElement delLinkedListElement = new DelLinkedListElement();

    @Test
    void removeElements() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(1);
        LinkedNode node3 = new LinkedNode(2);
        LinkedNode node4 = new LinkedNode(2);
        LinkedNode node5 = new LinkedNode(1);
        LinkedNode node6 = new LinkedNode(1);
        LinkedNode node7 = new LinkedNode(1);
        LinkedNode node8 = new LinkedNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        LinkedListUtils.printList(node1);

        LinkedNode linkedNode = delLinkedListElement.removeElements(node1, 1);
        LinkedListUtils.printList(linkedNode);
    }

    @Test
    void removeElements1() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(1);
        LinkedNode node5 = new LinkedNode(1);
        LinkedNode node6 = new LinkedNode(1);
        LinkedNode node7 = new LinkedNode(1);
        LinkedNode node8 = new LinkedNode(1);
        node1.next = node2;
        node2.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        LinkedListUtils.printList(node1);
        LinkedNode linkedNode = delLinkedListElement.removeElements(node1, 1);
        LinkedListUtils.printList(linkedNode);
    }

    @Test
    void removeElements3() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(2);
        LinkedNode node5 = new LinkedNode(3);
        LinkedNode node6 = new LinkedNode(4);
        LinkedNode node7 = new LinkedNode(3);
        LinkedNode node8 = new LinkedNode(5);
        node1.next = node2;
        node2.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        LinkedListUtils.printList(node1);
        LinkedNode linkedNode = delLinkedListElement.removeElements(node1, 3);
        LinkedListUtils.printList(linkedNode);
    }

    @Test
    void removeElements2() {
        LinkedNode node1 = new LinkedNode(1);
        LinkedListUtils.printList(node1);
        LinkedNode linkedNode = delLinkedListElement.removeElements(node1, 1);
        LinkedListUtils.printList(linkedNode);
    }

    @Test
    void removeElements4() {
//        LinkedNode node1 = new LinkedNode(1);
//        LinkedListUtils.printList(node1);
        LinkedNode linkedNode = delLinkedListElement.removeElements(null, 1);
        LinkedListUtils.printList(linkedNode);
    }

}