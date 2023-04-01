package com.company;
import java.util.Scanner;
//2 4 6 8 10 12 14 16 18 20 22 24 26 28 30

public class Question {

        public static void main(String args[]){
            Scanner ob=new Scanner(System.in);
            short day=ob.nextShort();
            int count=0;
            for(int i=1;i<=31;i++){
                if( i%2==0){
                    count++;
                }


            }
            System.out.println("the number of days he can go outside : "+count);
            System.out.println("the number of days he cannot go outside is : " + (31-count));
            System.out.println(1%2);










        }


    }


