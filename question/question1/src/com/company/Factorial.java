package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        long factorial=n;
        while(n>1){
            factorial=factorial*(n-1);
            n--;

        }
        if(factorial==1){
            System.out.println(1);

        }
        System.out.println(factorial);
    }
}
