package com.company;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        int number;float sum=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number of input number");
        int n=ob.nextInt();
        int denominator=n;
        while(n>0){
            System.out.println("enter the number");
            number=ob.nextInt();
            sum=sum+n;
            n--;


        }
        System.out.println(sum/denominator);

    }
}
