package com.company;
import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int marks;
        float sum=0;
        System.out.print("Enter the number of subjects : ");
        int n=ob.nextInt();
        int subject=0;
        for(int i=1;i<=n;i++){
            subject=subject+1;
            System.out.print("enter the marks of "+subject+" subject : ");
            marks=ob.nextInt();
            sum=sum+marks;
        }
        float percentage=(sum/(n*100))*100;
        System.out.println("percentage is : "+percentage);
        System.out.println("cgpa is : "+percentage/9.5);
    }
}
