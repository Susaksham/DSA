package com.company;

public class CircularLinkedList {
    public static void main(String str[]){
    Node5 head = new Node5(1);
    Node5 second = new Node5(2);
    Node5 third = new Node5(3);
    Node5 fourth = new Node5(4);
    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = head;
    print(head);
    head = insertAtEnd(head , 5);
    head = deleteAtKthPosition(head , 1);
    print(head);
    }
    // O(1) insertion
    public static Node5 insertAtThebegginningEfficiant (Node5 head){
        Node5 newHead = new Node5(-1);
        if(head == null){
            newHead.next = newHead;
            return newHead;
        }
        newHead.next = head.next;
        head.next = newHead;
        int temp = head.data ;
        head.data = newHead.data;
        newHead.data = temp;
        return head;

    }
    public static Node5 insertAtEndEfficiant( Node5 head , int x){
        Node5 newHead = new Node5(x);
        if(head == null){
            newHead.next = newHead;
            return newHead;
        }
        newHead.next = head.next;
        head.next = newHead;
        int temp = head.data ;
        head.data = newHead.data;
        newHead.data = temp;
        return newHead;
    }
    public static Node5 deleteHeadEfficiant( Node5 head){
        int temp = head.data;
        head.data = head.next.data;
        head.next.data = temp;
        Node5 pointer = head.next;
        head.next = pointer.next;
        return head;

    }
    public static Node5 deleteAtKthPosition (Node5 head , int pos){
        int currentPos = 1;
        Node5 pointer = head;
        if(head == null || head.next == null){
            return null;
        }
        if(pos == 1){

            head.data = head.next.data;
            head.next = head.next.next;
            return head;

        }
       do{
            if((currentPos) == (pos - 1)){
                pointer.next = pointer.next.next;
                return head;
            }
            currentPos++;
        } while(pointer != head);
        return head;

    }
    public static Node5 deleteHead( Node5 head){
        if(head == null || head.next == null){
            return null;
        }
        Node5 pointer = head;
        while (pointer.next != head){
            pointer = pointer.next;
        }
        pointer.next = head.next;
        head.next = null;
        return pointer.next;
    }
    public static Node5 insertAtEnd (Node5 head , int x){
        Node5 newNode = new Node5(x);
        Node5 pointer = head;
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        while( pointer.next != head){
            pointer = pointer.next;
        }
        newNode.next = pointer.next;
        pointer.next = newNode;
        return head;
    }
    // O(n) insertion
    public static Node5 insertAtTheBegginning(Node5 head){
        Node5 newHead = new Node5(0);
        if(head == null){
            newHead.next = newHead;
            return newHead;
        }
        Node5 pointer = head;
      while(pointer.next != head){
          pointer = pointer.next ;
      }
      pointer.next = newHead;
      newHead.next = head;
      return newHead;
    }
    public static void print (Node5 head){
        if(head == null){
            return;
        }
        Node5 pointer = head;
        do{
            System.out.println(pointer.data);
            pointer = pointer.next;
        }while(head != pointer);
    }
}
 class Node5 {
    int data ;
    Node5 next = null;
    Node5(int x){
        data = x;

    }
}
