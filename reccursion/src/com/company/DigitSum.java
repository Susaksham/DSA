package com.company;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(14));
    }
    static int digitSum (int number){
        if(number ==0){
            return 0;
        }
        return number%10 + digitSum(number/10);

//        if(number==0){
//            return sum;
//        }
//        int remainder = number%10;
//        sum= remainder+sum;
//        int newNumber= number/10;
//        return digitSum(newNumber,sum);
    }
}
