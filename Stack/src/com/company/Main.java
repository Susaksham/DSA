package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MyStackArrayList ob = new MyStackArrayList();
//        ob.push(0);
//        ob.push(1);
//        ob.push(2);
//        ob.push(3);
//        ob.push(4);
//        ob.push(5);
//        System.out.println(ob.pop());
//        System.out.println(ob.size());
//        System.out.println(ob.peek());
        MyStackLinkedListBest ob = new MyStackLinkedListBest();
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.push(6);
        ob.push(7);
        ob.push(8);
        System.out.println(ob.peek());
        int value = ob.pop();
        System.out.println(ob.peek());
        System.out.println(value);
        System.out.println(ob.size());

    }
}
class MyStack{
    int top ;
    int[] arr;
    MyStack(int lengthOfTheArray){
        arr = new int[lengthOfTheArray];
        top = -1;
    }
    public  void push (int x){
        arr[++top] = x;
    }
    public int pop (){
        int deletedElement = arr[top];
        arr[top--]= -1;
        return deletedElement;
    }
    public int size(){
        return top + 1;
    }
    public int peek(){
        return arr[top];
    }
}
class MyStackArrayList{
    int top ;

    ArrayList<Integer> arr;
    MyStackArrayList(){
        arr = new ArrayList();
        top = -1;
    }
    public  void push (int x){
        top++;
        arr.add(x);
    }
    public int pop (){
        int deletedElement = arr.get(top);

       arr.remove(top--);
        return deletedElement;
    }
    public int size(){
        return arr.size();
    }
    public int peek(){
        return arr.get(arr.size()-1);
    }
}
class MyStackLinkedListBest{
    int data ;
    int top = -1;
    MyStackLinkedList next;
    MyStackLinkedList head;
    public void push (int x){
        MyStackLinkedList newElement = new MyStackLinkedList();
        newElement.data = x;
        if(head == null){
            head = newElement;
        }
        else{
            newElement.next = head;
            head = newElement;
        }
        top++;
    }
    public int pop(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        if(head.next == null){
            top--;
            head = null;
            return Integer.MAX_VALUE;
        }
        int deletedValue = head.data;
        head = head.next;
        top--;
        return deletedValue;
    }
    public int peek(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
    public int size(){
        return top + 1;
    }
    public  boolean isEmpty(){
        if((top + 1) == 0){
            return true;
        }
        return false;
    }

}
// O(n)
class MyStackLinkedList{
    int data;
    int top =  -1;
    MyStackLinkedList head;
    MyStackLinkedList next;
    public  void push(int x){
        MyStackLinkedList newElement = new MyStackLinkedList();
        newElement.data = x;
        MyStackLinkedList pointer = head;

        if(top == -1){
            head = newElement;


        }
        else{

           while(pointer.next != null){
               pointer = pointer.next;
           }
           pointer.next = newElement;
        }
        top++;
    }
    public int pop(){
        MyStackLinkedList pointer = head;
        if(pointer == null){
            return -1;
        }
        if(pointer.next == null){
            head = null;
            top--;
            return pointer.data;

        }
        MyStackLinkedList secondLastPointer = head;
        pointer = pointer.next;

        while(pointer.next != null){
            pointer = pointer.next;
            secondLastPointer = secondLastPointer.next;
        }
        secondLastPointer.next = null;
        top--;
        return pointer.data;

    }
    public int peek(){
        MyStackLinkedList pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        return pointer.data;
    }
    public int size(){
        return top + 1;
    }
}

