package com.yt100.datastructure.linkedlist;

public class LinkedListUtils {

    public static void printList(LinkedNode head) {
        if (head == null) {
            System.out.println("list is null");
            System.out.println();
            return;
        }

        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("list is null");
            System.out.println();
            return;
        }

        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

}
