package com.company;

public class ReverseKLinkedList {
    public static void main(String[] args) {
    Node root = new Node(1);
    root.next = new Node(2);
    root.next.next = new Node(3);
    root.next.next.next = new Node(4);
    root.next.next.next.next = new Node(5);
//        root.next.next.next.next.next = new Node(6);
//        root.next.next.next.next.next.next = new Node(7);
        Node head = reverseKElement(root, 2);
        printList(head);
    }
    public static Node reverseKElement(Node head , int k){
        if(head == null){
            return head;
        }
        Node prev = null;
        Node curr = head;

        int count = 0;
        while(curr != null && count < k){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        Node next_head =  reverseKElement(curr , k);
        head.next = next_head;
        return prev;
    }
    public static void printList(Node head){
        Node current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
