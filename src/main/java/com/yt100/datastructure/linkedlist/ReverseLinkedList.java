package com.yt100.datastructure.linkedlist;

/**
 *
 */
public class ReverseLinkedList {

    /**
     * https://leetcode-cn.com/problems/reverse-linked-list-ii/
     * 92
     */
    public LinkedNode reverseBetween(LinkedNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;

        LinkedNode leftNodeTail = null; // 反转部分的左半边的尾节点
        LinkedNode reverseNode = null;
        LinkedNode reverseNodeTemp = null; // 记录反转部分的遍历位置
        LinkedNode reverseNodeTail = null;
        LinkedNode rightNode = null;

        int times = 1;

        while (times <= right) {

            if (times < left) {
                if (leftNodeTail != null) {
                    leftNodeTail = leftNodeTail.next;
                } else {
                    leftNodeTail = head;
                }
            } else if (times == left) {
                if (leftNodeTail != null) {
                    reverseNode = leftNodeTail.next;
                } else {
                    reverseNode = head;
                }

                reverseNodeTemp = reverseNode.next;
                reverseNode.next = null;
                reverseNodeTail = reverseNode;
            } else if (times < right) { // times < right
                LinkedNode next = reverseNodeTemp.next;
                reverseNodeTemp.next = reverseNode;
                reverseNode = reverseNodeTemp;
                reverseNodeTemp = next;
            } else if (times == right) {
                rightNode = reverseNodeTemp.next;

                reverseNodeTemp.next = reverseNode;
                reverseNode = reverseNodeTemp;
                reverseNodeTail.next = rightNode;
                if (leftNodeTail != null) {
                    leftNodeTail.next = reverseNode;
                } else {
                    return reverseNode;
                }
                return head;
            }
            times++;
        }

        return null;
    }

    /**
     * https://leetcode-cn.com/problems/reverse-linked-list/
     * 206 reverse list
     */
    public LinkedNode reverseList(LinkedNode head) {
        if (head == null || head.next == null) return head;

        LinkedNode newList = null;

        while (head != null) {
            LinkedNode second = head.next;
            head.next = newList;
            newList = head;
            head = second;
        }

        return newList;
    }

}
