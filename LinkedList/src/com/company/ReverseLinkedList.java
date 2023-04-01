package com.company;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head =  new Node(1);
        head.next   = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
       Node reverseHead =  reverseLinkedList(head);


    }
    public static Node reverseLinkedList(Node head){
        if(head.next == null){
            return head;
        }
        Node header = reverseLinkedList(head.next);
        Node nextNode = head.next;
        nextNode.next = head;
        head.next = null;
        return header;


    }

}
