package com.company;

import java.util.Stack;

public class StackSpanProblem {
    public static void main(String[] args) {
        int[] array = {13 , 15 , 12 , 14 , 16 , 8 , 6 , 4 , 10 , 30};
        stackSpanProblem(array);
    }
    public static void stackSpanProblem( int[] arr){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.println(1);
        for(int i=1; i< arr.length; i++){
            while(!s.isEmpty() && (arr[s.peek()] <= arr[i]) ){
                s.pop();
            }
            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.println(span);
            s.push(i);
        }
    }
}
