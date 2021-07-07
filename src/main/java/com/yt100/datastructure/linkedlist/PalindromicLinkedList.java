package com.yt100.datastructure.linkedlist;

public class PalindromicLinkedList {

    /**
     * 快指针往前走，慢指针反转前半部分
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        if (head.next.next == null) return head.val == head.next.val;

        ListNode reversedLeftHead = null; //被反转的前半部分
        ListNode rightHead = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {// 反转前半部分，并找到后半部分的头结点
            if (fast.next == null) {
                fast = null;
                continue;
            }

            fast = fast.next.next;
            ListNode slowNext = slow.next;

            slow.next = reversedLeftHead;
            reversedLeftHead = slow;
            slow = slowNext;
            if (fast != null) {
                rightHead = slow.next;
            }
        }

        while (rightHead != null) {
            // 两个链表的元素一一对比
            if (rightHead.val != reversedLeftHead.val) return false;

            rightHead = rightHead.next;
            reversedLeftHead = reversedLeftHead.next;
        }

        return true;
    }

}
