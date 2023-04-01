package com.company;

public class ProductDigit {
    public static void main(String args[]){
        System.out.println(digitProduct(5123232));
    }
    public static int digitProduct(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*(digitProduct(n/10));
    }
}
