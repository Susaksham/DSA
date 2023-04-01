package com.company;

public class PrintingNumber {
    public static void main(String[] args) {
        //printingNumber(5);
//        printingNumberInOrder(3,6);
        funBoth(5);
    }
   public static void  printingNumber(int n){
        if(n==0){
            return ;
        }
       System.out.println(n);
        printingNumber(n-1);
   }
   public static void printingNumberInOrder(int start, int end){
//        if(n==0){
//            return ;
//        }
//        printingNumberInOrder(n-1);
//       System.out.println(n);
       if(start >end){
           return;
       }
       System.out.println(start);
       printingNumberInOrder(start+1,end);

   }
   public static void funBoth(int n){
        if(n==0){
            return;
        }
       System.out.println(n);
        funBoth(n-1);
       System.out.println(n);
   }
}
