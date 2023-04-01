package com.company;
import java.util.Scanner;
//i have to take input from the user until it is not entering 0
//while(true){input user in the form of string then i will take each character from it and by using if statement
// compare with character from 1 to 9
//then i will those character in a string and convert it into a number
//if that number is postive or negative
//if number is positive---> then move to the if statement where it will check even or not
//if even ---->add in postive even section
//if odd--->add in positive odd section
//if number is negative then add it into a negative section


public class ConditionQuestion {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        String converted="";
        int number=0;
        int evensum=0;
        int oddsum=0;
        int negativesum=0;
        outerloop:
        while(true){
            System.out.println("enter the number");
            String input= ob.next();
            innerloop:
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)>='1' && input.charAt(i)<='9'){
                    converted="";
                    converted=converted+input.charAt(i);

                }
                else if(input.charAt(0)=='0'){
                    break outerloop;
                }
                else{
                    break innerloop;
                }


            }
            number=Integer.parseInt(converted);
            if(number>=0){
                //if positive
                if(number%2==0){
                    evensum=evensum+number;

                }
                else{
                    oddsum=oddsum+number;
                }
            }
            else{
                //if negative
                negativesum=negativesum+negativesum;
            }
        }
        System.out.println(oddsum);
        System.out.println(evensum);
        System.out.println(negativesum);
    }
}
