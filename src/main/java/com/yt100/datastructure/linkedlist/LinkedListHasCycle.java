package com.yt100.datastructure.linkedlist;

/**
 * 链表中是否有环
 */
public class LinkedListHasCycle {

    /**
     * 快慢指针解法
     */
    public boolean hasCycle(LinkedNode head) {
        if (head == null || head.next == null) return false;

        LinkedNode slow = head;
        LinkedNode fast = head.next;

        while (fast != null) {
            if (slow == fast) return true;

            if (fast.next == null) return false;
            fast = fast.next.next;

            slow = slow.next;
        }
        return false;
    }

}
