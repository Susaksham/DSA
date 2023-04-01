package com.company;
import java.util.Scanner;
//we have to take a digit and add into varibale(sum) of digits
public class SumOfDigits {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number : ");
        int number=ob.nextInt();
        int sum=0;
        int digit=0;
        while(number>0){
            digit=number%10;
            number=number/10;
            sum=sum+digit;
        }
        System.out.println(sum);

    }
}
