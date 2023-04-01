package com.company;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the x coordinate of 1st point  :");
        int x1=ob.nextInt();
        System.out.println("Enter the y coordinate of 1st point : ");
        int y1=ob.nextInt();
        System.out.println("Enter the x coordinate of 2nd point");
        int x2=ob.nextInt();
        System.out.print("Enter the y coordinate of 2nd point");
        int y2=ob.nextInt();
        double inside=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double distance =Math.sqrt(inside) ;
        System.out.println(distance);


    }
}
