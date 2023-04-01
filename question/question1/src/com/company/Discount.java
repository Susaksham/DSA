package com.company;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args){
        Scanner ob= new Scanner(System.in);
        System.out.print("enter the cost of the product : ");
        float cost=ob.nextFloat();
        System.out.println("enter the discount : ");
        float discount=ob.nextFloat();
        float amountOff=discount/100*cost;
        float netcost=cost-amountOff;
        System.out.println("After discount the cost is : "+netcost);


    }
}
