package com.company;
class Node2{
    int data;
    Node2 next;
    Node2(int x){
        data = x;
        next = null;
    }
}
public class InsertionAtBegginingOfLinkedList {
    public static void main(String[] args) {
    Node2 head = null;

    head = insertionAtBeginingOfLinkedList(head , 5);
    head = insertionAtBeginingOfLinkedList(head , 8);
    head = insertionAtBeginingOfLinkedList(head , 9);
    printList(head);

    }
    public static Node2 insertionAtBeginingOfLinkedList(Node2 head , int x){
        Node2 temp = new Node2(x);
        temp.next = head;
        return temp;
    }
    public static void printList(Node2 head){
        Node2 current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
