package com.company;
import java.util.Scanner;

public class Commision {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the commisionpercentage : ");
        float commisionpercentage=ob.nextFloat();
        System.out.println("Enter the amount : ");
        float amount=ob.nextFloat();
        float commision=commisionpercentage/100*amount;
        System.out.println(commision);
    }
}
