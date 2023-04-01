package com.company;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        float newvalue=0, sum=0;
        String value;
        Scanner ob=new Scanner(System.in);
        mainloop:
        while(true){
            System.out.print("enter the number : ");
             value=ob.next();
             for(int i=0;i<value.length();i++){
                 if(value.charAt(i)>='0' && value.charAt(i)<='9'){
                  newvalue=Float.parseFloat(value);


                 }
                 else{
                     break mainloop;
                 }

             }
             sum=sum+newvalue;


        }
        System.out.println("Sum of all the number is "+sum);
    }
}
