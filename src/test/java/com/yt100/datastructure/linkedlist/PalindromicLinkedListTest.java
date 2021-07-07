package com.yt100.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicLinkedListTest {

    PalindromicLinkedList palindromicLinkedList = new PalindromicLinkedList();

    @Test
    void isPalindrome() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertTrue(palindrome);
    }

    @Test
    void isPalindrome1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertTrue(palindrome);
    }

    @Test
    void isPalindrome2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertTrue(palindrome);
    }

    @Test
    void isPalindrome3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertFalse(palindrome);
    }

    @Test
    void isPalindrome4() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertFalse(palindrome);
    }

    @Test
    void isPalindrome5() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertTrue(palindrome);
    }

    @Test
    void isPalindrome6() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node1.next = node2;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertTrue(palindrome);
    }

    @Test
    void isPalindrome7() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        LinkedListUtils.printList(node1);
        boolean palindrome = palindromicLinkedList.isPalindrome(node1);
        assertFalse(palindrome);
    }

}