package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    triangle1(4,0);
    triangle2(4,0);
        System.out.println();
    triangle3(4,1,4);
    }
//    public static void pattern(int n){
//        if(n==0){
//            return;
//        }
//        helper(n);
//        System.out.println();
//        pattern(n-1);
//    }
//    public static void helper(int n){
//        if(n==0){
//            return;
//        }
//        System.out.print("* ");
//        helper(--n);
//    }
        public static void triangle3(int row , int col, int fixed){
        if(row==0){
            return;
        }
        else if(col<row){
            System.out.print(" ");
            triangle3(row,col+1,fixed);
        }
        else if(col<=fixed){
            System.out.print("* ");
            triangle3(row,col+1,fixed);
        }
        else if(col>fixed){
            System.out.println();
            triangle3(row-1, 1,fixed);
        }

        }
    public static void triangle2(int row , int col){

        if(row==0){
            return;

        }

        else if (col<row){
            triangle2(row, col+1);
            System.out.print("* ");

        }
        else{
            triangle2(row-1,0);
            System.out.println();

        }


    }
    public static void triangle1(int row , int col){

         if(row==0){
            return;

        }

        else if (col<row){
            System.out.print("* ");
            triangle1(row, col+1);
        }
        else{
             System.out.println();
            triangle1(row-1,0);
         }


    }

}
