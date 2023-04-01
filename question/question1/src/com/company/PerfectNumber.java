package com.company;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner ob= new Scanner(System.in);
        int perfect=ob.nextInt();
        int sum=0;
        for(int i=1;i<perfect;i++){
            if(perfect%i==0){
                sum=sum+i;
            }
        }
        if(sum==perfect){
            System.out.println("it is perfect number");
        }
        else{
            System.out.println("it is not a perfect number");
        }
    }
}
