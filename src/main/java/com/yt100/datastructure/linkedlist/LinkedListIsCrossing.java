package com.yt100.datastructure.linkedlist;

/**
 * 两条链表是否相交
 */
public class LinkedListIsCrossing {

    public LinkedNode getIntersectionNode(LinkedNode headA, LinkedNode headB) {
        if (headA == null || headB == null) return null;

        LinkedNode node1 = headA;
        LinkedNode node2 = headB;
        boolean over1 = false;
        boolean over2 = false;

        while (node1 != null && node2 != null) {
            if (node1 == node2) {
                return node1;
            }

            if (node1.next == null && !over1) {
                node1 = headB;
                over1 = true;
            } else {
                node1 = node1.next;
            }

            if (node2.next == null && !over2) {
                node2 = headA;
                over2 = true;
            } else {
                node2 = node2.next;
            }

        }

        return null;
    }

}
