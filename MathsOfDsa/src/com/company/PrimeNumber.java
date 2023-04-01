package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(51));
    }
    public static boolean primeNumber(int number){
        int c=2;
        while(c*c <= number){
            if(number % c == 0){
                return false;
          }
            c++;
        }

//        for(int i=2;i<=Math.sqrt(number);i++){
//            if(number % i == 0){
//                return false;
//            }
//        }
//
//
//
//        return true;
        return true;
    }
}
