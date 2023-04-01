package com.company;

public class SimpleInterest {
    public static void main(String args[]){
        float principal=3000;
        float rate=3;
        float time=2;
        System.out.println(principal*Math.pow((1+rate/100),time));


    }
}
