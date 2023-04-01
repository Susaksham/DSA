package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    public static void main(String[] args){
    MyHash ob = new MyHash(7);
    ob.insert(5);
    ob.insert(8);
    ob.insert(123);
        System.out.println(ob.search(8));
    }
}
class MyHash{
    int m=7;
    ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>() ;

    ;

    MyHash(int b){
        for(int i=0; i< b;i++){
            list.add(new LinkedList<Integer>());
        }
    }
    void insert(int element){
        int index = element % m;
        list.get(index).add(element);
    }
    void remove ( int element){
        int index = element % m;
        list.get(index).remove((Integer) element);
    }
    boolean search (int element){
        int index = element % m;
        boolean result = list.get(index).contains(element);
        return result;
    }
}
