package com.company;

import java.util.Stack;

public class StackThatSupportGetMin {
    public static void main(String[] args) {
      MyStackMin stack  = new MyStackMin();
      stack.push(5);
        stack.push(10);
        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.pop();
        stack.pop();
        System.out.println(stack.minValue());

        stack.pop();
        System.out.println(stack.minValue());
        stack.pop();
        System.out.println(stack.minValue());

        stack.pop();

        System.out.println(stack.minValue());





    }

}

class MyStackMin {
    int min;
    Stack<Integer> s;
    MyStackMin(){
        s= new Stack<>();
    }
    void push( int x){
        if(s.isEmpty()){
            min = x;
            s.push(x);
            return;
        }
        if(min > x){
            s.push((x - min));
            min = x;
            return;
        }
        s.push(x);
    }
    int pop(){
        int t = s.pop();
        if(t <= 0){
           int  res = min;
           min = min - t;
           return res;

        }
        return t;
    }
    int minValue(){
        return min;
    }
}
