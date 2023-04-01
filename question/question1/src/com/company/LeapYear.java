package com.company;
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner ob= new Scanner(System.in);
        System.out.println("enter the year : ");
        int year=ob.nextInt();
        if(year%4==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }


    }
}
