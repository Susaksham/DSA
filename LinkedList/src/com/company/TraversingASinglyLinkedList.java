package com.company;
class Node1{
    int data;
    Node1 next ;
    Node1(int x){
       data = x;
       next = null;
    }
}
public class TraversingASinglyLinkedList {
    public static void main(String[] args) {

    Node1 head = new Node1(10);
    Node1 node2 = new Node1(20);
    Node1 node3 = new Node1(30);
    Node1 node4 = new Node1(40);
    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next= null;
    printList(head);
//    usingRecurrsion(head);
       head =  sortedInsertInLinkedList(head , new Node1(25));
        printList(head);

    }
    public static void printList(Node1 head){
        Node1 current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static Node1 sortedInsertInLinkedList(Node1 head , Node1 insertedNode){
        Node1 pointer = head;
        if(head == null){
            return insertedNode;
        }
        if(  pointer.data > insertedNode.data ){
            insertedNode.next = pointer;
            return insertedNode;
        }
        while(pointer.next != null && pointer.next.data < insertedNode.data){
            pointer = pointer.next;
        }
        if(pointer.next != null){
            insertedNode.next = pointer.next;
            pointer.next = insertedNode;
            return head;
        }
        else{
            pointer.next = insertedNode;
            return head;
        }
    }
    public static void usingRecurrsion (Node1 head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        usingRecurrsion(head.next);
    }
}
