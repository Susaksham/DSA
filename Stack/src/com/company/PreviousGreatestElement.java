package com.company;

import java.util.Stack;

public class PreviousGreatestElement {
    public static void main(String[] args) {
        int[] array = {20 , 30 , 10 , 5 , 15};
        previousGreatestElement(array);
    }
    public static void previousGreatestElement( int[] arr){
        Stack<Integer> s = new Stack<>();
        System.out.println(-1);
        s.push(arr[0]);
        for(int i=1; i< arr.length; i++){
            while(!s.isEmpty() && (arr[i] >= s.peek())){
                s.pop();
            }
            int nearestGreatestElement = s.isEmpty() ? -1 : s.peek();
            System.out.println(nearestGreatestElement);
            s.push(arr[i]);
        }
    }
}
