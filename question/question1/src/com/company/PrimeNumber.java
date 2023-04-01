package com.company;
import java.util.Scanner;
//i will check the remainder of every number form 2 to till the root of that number if it doesnot divide it means it is prime
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int input=ob.nextInt();
        int c=2;
        int i;
        for(i=2;i*i<=input;i++){
            if(input%i==0){
                System.out.println("it is not a prime");
                break;
            }
        }
        if(i*i>input){
            System.out.println("it is a prime number");
        }




    }
}
