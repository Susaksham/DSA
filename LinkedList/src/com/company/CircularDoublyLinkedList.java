package com.company;

public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        Node6 head = new Node6(0);
        Node6 second = new Node6(1);
        Node6 third = new Node6(2);
        Node6 fourth = new Node6(3);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;
        fourth.prev = third;
        third.prev = second;
        second.prev = head;
        head.prev = fourth;
        printAllTheNode(head);
        head = addElementAtTheStart(head);

        printAllTheNode(head);

    }
    public static Node6 addElementAtTheStart(Node6 head){
        Node6 newElement = new Node6(-1);
        if(head == null){
            newElement.next = newElement;
            newElement.prev = newElement;
            return newElement;
        }

        newElement.prev = head.prev;
        head.prev = newElement;
        newElement.next = head;
        newElement.prev.next = newElement;
        return newElement;
    }
    public static void printAllTheNode( Node6 head){
        Node6 iterator = head;
        do{
            System.out.println(iterator.data);
            iterator = iterator.next;
        }while(iterator !=head);
    }

}
class Node6{
    int data;
    Node6 prev;
    Node6 next;
    Node6(int x){
        data = x;

    }
}
