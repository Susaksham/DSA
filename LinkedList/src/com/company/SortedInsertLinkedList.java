package com.company;

public class SortedInsertLinkedList {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        Node1 node2 = new Node1(20);
        Node1 node3 = new Node1(30);
        Node1 node4 = new Node1(40);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next= null;
        sortedInsert(head , 50);
        printList(head);
        sortedInsertBest(head , 15);
        printList(head);
    }
    public static Node1 sortedInsertBest(Node1 head , int element){
        Node1 newNode = new Node1(element);
        if(head == null){
            return newNode;
        }
        if(head.data > element){
            newNode.next = head;
            return newNode;
        }
        Node1 curr = head;
        while(curr.next != null && curr.next.data < element){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static Node1 sortedInsert(Node1 head , int element){
        Node1 newNode = new Node1(element);
        Node1 curr = head;
        boolean flag = false;
        while( curr.data < element ){
            if(curr.next == null){
                flag = true;
                break;
            }
            curr= curr.next;

        }
        if(flag){
            curr.next = newNode;
        } else {
            newNode.next = curr.next;
            curr.next = newNode;
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
        }
        return head;

    }
    public static void printList(Node1 head){
        Node1 current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
