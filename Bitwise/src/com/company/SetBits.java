package com.company;

public class SetBits {
    public static void main(String[] args) {
        int n=521;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    public static int setBits( int n){
        int count=0;
        while(n>0){
            count++;
//            n = n - (n & (- n));
            n= n  & (n-1);
        }

        return count;


    }
}
