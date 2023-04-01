package com.company;

import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
    int[] arr  = {5 , 15 , 10 , 8 , 6 , 12 , 9 , 18};
    nextGreatestElement(arr);
    }
    public static void nextGreatestElement(int[] arr){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(arr[arr.length-1]);
//        System.out.println(-1);
        for(int i= arr.length-2; i>=0; i--){
           while(!stack1.isEmpty() && stack1.peek()<arr[i]){
               stack1.pop();
           }
           int element = stack1.isEmpty() ? -1 : stack1.peek();
           stack2.push(element);
           stack1.push(arr[i]);
        }
        while(!stack2.isEmpty()){
            System.out.println(stack2.peek());
            stack2.pop();
        }
    }
}
