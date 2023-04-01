package com.company;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the Power usage in Watts: ");
        float power=input.nextFloat();
        System.out.println("enter the time in hour: ");
        float hours=input.nextFloat();
        System.out.println("1kW cost is : 9Rs");
        int cost=9;
        float total_cost=power/1000/hours*9;
        System.out.println(total_cost);
    }
}
