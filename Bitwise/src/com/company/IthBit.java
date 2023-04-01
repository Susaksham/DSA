package com.company;

public class IthBit {
    public static void main(String[] args){
        System.out.println(bitValue(2,3));
    }
    public static int bitValue(int n , int position){
        return n & (1<<(position-1));
    }
}
