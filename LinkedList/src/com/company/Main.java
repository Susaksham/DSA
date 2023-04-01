package com.company;
class Node{
    int data;
    Node next ;
    Node( int x){
        data = x;
        next = null;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = new Node(3);
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        head.next = node1;
        node1.next = node2;
        node2.next = null;
    }

}
