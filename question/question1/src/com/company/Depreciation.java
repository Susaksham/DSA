package com.company;
import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the actual cost: ");
        int actualCost= ob.nextInt();
        System.out.print("Enter the cost of depreciation : ");
        int year=1;
        int depriCost= ob.nextInt();
        while(actualCost!=0){
            System.out.println("for the year "+year);
            actualCost=actualCost-depriCost;
            if((actualCost)>=0) {

                System.out.println("real cost after depreciation :" + actualCost);
            }
            else{
                actualCost=0;
                System.out.println("real cost after depreciation "+actualCost);
            }
            year++;
        }


    }
}
