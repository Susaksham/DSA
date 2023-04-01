package com.company;
import java.util.Scanner;
public class BattingAverage {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Runs of the batsman : ");
        float runs=input.nextInt();
        System.out.print("Enter the number of matches played by the batsman : ");
        float matches=input.nextInt();
        System.out.print("Enter the number of times batsman was notout : ");
        int notOut=input.nextInt();
        float average=runs/(matches-notOut);
        System.out.println(average);
    }
}
