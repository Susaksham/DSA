package com.company;

public class ToFindTheBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Math.floor((Math.log10(n) / Math.log10(2)) + 1));
        // 1010
        System.out.println(Integer.bitCount(n));
    }
}
