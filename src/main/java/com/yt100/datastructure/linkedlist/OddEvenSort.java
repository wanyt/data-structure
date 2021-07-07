package com.yt100.datastructure.linkedlist;

public class OddEvenSort {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        int times = 1;
        ListNode oddTail = null;
        ListNode evenTail = null;

        while (cur != null) {
            if (times % 2 == 1) {
                if (oddTail != null) {
                    ListNode oddListTailNext = oddTail.next; // 记录2
                    ListNode curNext = cur.next; // 记录4
                    oddTail.next = cur; // 连接 1 -> 3
                    cur.next = oddListTailNext; // 连接 3 -> 2
                    if (curNext == null && evenTail != null) {
                        evenTail.next = null; // 总数为奇数的链表
                    }

                    oddTail = cur; // 3 作为 oddTail
                    cur = curNext; // 4 作为下一个遍历节点
                    times++;
                    continue;
                } else {
                    oddTail = cur;
                }
            } else {
                if (evenTail != null) {
                    ListNode curNext = cur.next; // 记录5
                    evenTail.next = cur; // 连接 2 -> 4
                    evenTail = cur; // 4 作为evenTail
                    cur.next = null;

                    cur = curNext; // 5 作为下一个遍历节点
                    times++;
                    continue;
                } else {
                    evenTail = cur;
                }
            }

            times++;
            cur = cur.next;
        }
        return head;
    }

}
