package com.company;

public class DoublyLinkedListGfg {
    public static void main(String[] args) {
        Node4 head = new Node4(4);
        Node4 temp = new Node4(5);
        Node4 temp1 = new Node4(6);
        head.next = temp;
        temp.next = temp1;
        temp1.prev = temp;
        temp.prev = head;
        printTheNodes(head);
//        head = addElementAtTheBeggining(head,3 );
//        printTheNodes(head);
//        head  = reverseDoublyLinkedList(head);
//        printTheNodes(head);
//        System.out.println("done");
//        head = deleteFirstNode(head);
//        head = deleteLastNode(head);
//        printTheNodes(head);
        head = addElementAtTheEnd(head , 8);
        printTheNodes(head);

    }
    public static Node4 addElementAtTheBeggining(Node4 head , int x){
    Node4 newHead = new Node4(x);
    newHead.next = head;
    if(head != null){
        head.prev = newHead;
    }

    return newHead;

    }
    public static Node4 addElementAtTheEnd( Node4 head , int x){
        Node4 pointer = head;
        Node4 newNode = new Node4(x);
        if(head == null){
            return newNode;
        }
        while(pointer.next !=null){
            pointer = pointer.next;
        }
        pointer.next = newNode;
        newNode.prev = pointer;
        return head;
    }
    public static Node4 deleteLastNode ( Node4 head){
        if(head == null || head.next == null){
            return null;
        }
        Node4 pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
//        Node4 secondLastNode = pointer.prev;
//        pointer.prev = null;
//        secondLastNode.next = null;
        pointer.prev.next = null;
        return head;

    }
    public static Node4 deleteFirstNode (Node4 head ){
        if(head == null || head.next == null){
            return null;
        }
        Node4 pointer = head;
        pointer =pointer.next;
        pointer.prev = null;
        return pointer;
    }
    public static void printTheNodes(Node4 head){
        Node4 pointer = head;
        while(pointer != null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }
    public static Node4 reverseDoublyLinkedListBest( Node4 head){
        Node4 prev = null;
        Node4 pointer = head;
        if(pointer == null || pointer.next == null){
            return head;
        }
        while(pointer !=  null){
            // swapping the prev from next
            prev = pointer.prev;
            pointer.prev = pointer.next;
            pointer.next = prev;
            pointer = pointer.prev;// to move to the next element as prev has been swapped
        }
        return prev.prev;/*on the last element we will save the pointer.prev this means the second last element and to
        move to the last element we will do prev.prev as previous is swapped with next*/
    }
    public static Node4 reverseDoublyLinkedList(Node4 head){
        Node4 pointer = head;
        boolean flag = false;
        Node4 anotherPointer = null;
        if(pointer == null || pointer.next == null){
            return head;
        }
       do {
//
             Node4 pointer2 = pointer.prev;
             pointer.prev = pointer.next;
             pointer.next = pointer2;
             if(pointer.prev == null){
                 return pointer;

             }
             pointer= pointer.prev;

             anotherPointer = pointer.prev;
             System.out.println("error");
         }while(pointer.prev !=null);
       return head;


    }
}
class  Node4{
    int data ;
    Node4 prev;
    Node4 next ;
    Node4(int x){
        data = x;
        prev = null;
        next = null;

    }
}
