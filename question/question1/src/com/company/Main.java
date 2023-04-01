package com.company;


import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=ob.nextInt();
        int value=x;
        int digits=0;
        int remainder=0;
        double sum=0;
        while(value>0){
            value=value/10;
            ++digits;
        }
        value=x;
        while(value>0){
            remainder=value%10;
            value=value/10;
            sum=sum+Math.pow(remainder,digits);


        }
        System.out.println((int)sum);





//0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
    }
}
