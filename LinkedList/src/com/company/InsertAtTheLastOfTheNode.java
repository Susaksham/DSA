package com.company;
class Node3{
    int data;
    Node3 next;
    Node3(int x){
        data = x;
        next = null;
    }
}

public class InsertAtTheLastOfTheNode {
    public static void main(String[] args) {
      Node3 head = null;
        head = insertNodeAtLast(head , 123);
       head =  insertNodeAtLast(head , 23);
       head = insertNodeAtLast(head , 24);
       head = insertNodeAtLast(head , 233);
//        printList(head);
//        head = deletingFirstNode(head);
//        System.out.println("done");
//        printList(head);
//        head = deletingLastNode(head);
//        insertionAtParticularIndex(head , 69 , 8);
//        System.out.println("after deleting the last node ");
//        printList(head);
        System.out.println(searchingTheNode(head, 24));;
        System.out.println(recursiveSearching(head , 123 , head ));

    }
    public static int searchingTheNode( Node3 head , int x){
        Node3 iterator = head;
        int pointer = 1;
        while(iterator != null){
            if(iterator.data == x){
                return pointer;
            }
            iterator = iterator.next;
            pointer++;
        }
        return -1;
    }
    public static int recursiveSearching( Node3 head, int x , Node3 iterator ){
        if(iterator == null){
            return -1;
        }
        else if( iterator.data == x){
            return 1;
        }
        int result =  recursiveSearching(head , x , iterator.next );
        if(result == -1){
            return -1;
        }
        return result + 1;
    }
    public static Node3 insertNodeAtLast(Node3 head , int x){
        Node3 newNode = new Node3(x);
        if(head == null){
            return newNode;
        }
        Node3 curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = null;
        return head;

    }
    public static Node3 deletingFirstNode(Node3 head){
        if(head == null){
            return null;
        }

        head = head.next;// just dereferencing the head node

        return head;
    }
    public static Node3 insertionAtParticularIndex(Node3 head , int element , int index){
        Node3 counter = head;
        int pointerIndex = 0;
        Node3 insertedNode = new Node3(element);
        if(index == 0){
            insertedNode.next = head;
            return insertedNode;
        }
        while(pointerIndex < (index-1) && counter!= null){
            counter = counter.next;
            pointerIndex++;

        }
        if(counter == null){
            return head;
        }

        insertedNode.next = counter.next;
        counter.next = insertedNode;
        return head;
    }
    public static Node3 deletingLastNode(Node3 head){
        if(head == null){
            return head;
        }
        if(head.next == null){
            head = null;
            return head;
        }
        Node3 current = head;

        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;

    }
    public static void printList(Node3 head){
        Node3 current = head;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
