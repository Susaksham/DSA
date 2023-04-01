package com.company;
import java.util.Scanner;


//input from the user of int type
//while(value>0){
/*
digit=value%10;
value=value/10;
if(digit==7)
{
count++}
 */

public class DigitCalculation {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        long input=in.nextLong();
        long value=input;
        int digit=0;
        int count=0;
        while(value>0){
            digit=(int)value%10;
            value=(int)value/10;
            if(digit==7){
                count++;
            }
        }
        System.out.println(count);
    }
}
