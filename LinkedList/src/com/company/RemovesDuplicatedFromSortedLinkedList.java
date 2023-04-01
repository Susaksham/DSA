package com.company;

public class RemovesDuplicatedFromSortedLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next= new Node(40);
        deleteDuplicates(head);
    }
    public static Node deleteDuplicates(Node head) {
        Node curr = head;
        while(curr != null){
            if(curr.next != null && (curr.data == curr.next.data)){
                curr.next = curr.next.next;
            } else{
                curr = curr.next;
            }
        }
        return head;
    }
}
