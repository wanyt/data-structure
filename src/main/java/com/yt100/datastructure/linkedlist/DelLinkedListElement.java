package com.yt100.datastructure.linkedlist;

/**
 * 203
 */
public class DelLinkedListElement {

    public LinkedNode removeElements(LinkedNode head, int val) {
        LinkedNode prev = null;
        LinkedNode temp = head;
        LinkedNode newHead = null;

        while (temp != null) {
            if (temp.val == val) {
                if (prev != null) {
                    prev.next = temp.next;
                }
                temp = temp.next;
                continue;
            }

            if (prev == null) {
                newHead = temp;
            }

            prev = temp;
            temp = temp.next;
        }

        return newHead;
    }

}
