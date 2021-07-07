package com.yt100.datastructure.linkedlist;

/**
 * https://leetcode-cn.com/leetbook/read/linked-list/jy291/
 * 设计实现链表
 *
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val 的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 *
 */
class MyLinkedList {

    public MyLinkedList() {
    }

    private LinkedNode head; // 头结点
    private LinkedNode tail; // 尾节点

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (!hasElement() || index < 0) {
            return -1;
        }

        LinkedNode temp = head;
        int times = 0;
        while (temp != null) {
            if (times == index) {
                return temp.val;
            }
            temp = temp.next;
            times++;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        LinkedNode node = new LinkedNode(val, null);
        boolean b = hasElement();
        if (!b) { // 空链表
            head = node;
            tail = node;
            return;
        }

        if (head == tail) { // 链表中只有一个元素
            head = node;
            node.next = tail;
            return;
        }

        node.next = head;
        head = node;
    }

    private boolean hasElement(){
        return head != null && tail != null;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        LinkedNode node = new LinkedNode(val, null);
        // 链表为空
        if (!hasElement()) {
            head = node;
            tail = node;
            return;
        }

        // 链表只有一个元素
        // 正常链表
        tail.next = node;
        tail = node;
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        LinkedNode node = new LinkedNode(val, null);

        if (index <= 0) { // index < 0
            addNodeInHead(node);
            return;
        }

        LinkedNode prev = null;
        LinkedNode temp = head;
        int times = 0;

        while (temp != null) {
            if (times == index) {
                if (prev != null) {
                    node.next = temp;
                    prev.next = node;
                } else {
                    addNodeInHead(node);
                }
            }

            prev = temp;
            temp = temp.next;
            times++;
        }

        if (times == index) { // index == length
            tail.next = node;
            tail = node;
        }

        // index > length
    }

    private void addNodeInHead(LinkedNode node) {
        // 头部添加节点
        if (!hasElement()) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head = node;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (!hasElement() || index < 0) {
            return;
        }

        LinkedNode prev = null;
        LinkedNode temp = head;
        int times = 0;

        while (temp != null) {
            if (times == index) {
                if (prev != null) {
                    prev.next = temp.next;
                    if (prev.next == null) tail = prev;
                } else {
                    head = temp.next;
                }
                return;
            }

            prev = temp;
            temp = temp.next;
            times++;
        }
    }

    public LinkedNode getHead() {
        return head;
    }

}
