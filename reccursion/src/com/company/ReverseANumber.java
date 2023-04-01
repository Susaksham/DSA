package com.company;

public class ReverseANumber {
    public static void main(String[] args) {
       // System.out.println(reverse(12345));
        rev1(123456);
        System.out.println(sum);
    }
    public static int reverse(int n){
        if(n==0){
            return 0;
        }
        return (int)(((n%10)*(Math.pow(10,(int)Math.log10(n))) ) + reverse(n/10));
    }
    static int sum =0;
    public static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;
        rev1(n/10);
    }


}
