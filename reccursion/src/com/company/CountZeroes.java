package com.company;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(12002303,0));
    }
    public static int countZeroes(int n , int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return countZeroes(n/10,count+1);
        }
        return countZeroes(n/10, count);
    }
}
