package com.company;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        long input=in.nextLong();
        long value=input;
        int digit=0;
        int count=0;
        long reverse=0;
        while(value>0){
            digit=(int)value%10;
            value=(int)value/10;
            reverse=reverse*10+digit;


        }
        System.out.println(reverse);
    }
}
