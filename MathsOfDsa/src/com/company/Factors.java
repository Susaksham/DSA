package com.company;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(10);
    }
    //both time and space will be O(sqrt(N))
    public static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i ==0){

                if((n/i) == i){
                    System.out.println(i);
                }
                else{
                    System.out.println(i);
                   list.add(n/i);
                }

            }
        }
        for(int element= list.size()-1; element>=0;element--){
            System.out.println(list.get(element));
        }
    }
    //O(Math.sqrt(n))
    //It is not printing it in the sorted order
    public static void factors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                System.out.println(i);
                if((n/i) == i){
                    continue;
                }
                System.out.println(n/i);
            }
        }
    }
    //O(n)
    public static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i ==0){
                System.out.println(i);
            }
        }
    }

}
