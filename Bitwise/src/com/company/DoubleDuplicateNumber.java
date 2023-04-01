package com.company;

public class DoubleDuplicateNumber {
    /*only for the numbers that are coming even times*/
    public static void main(String args[]){
        int arr[] ={1,1,2,3,2,4,3,4,8};
        System.out.println(singleNumber(arr));
        System.out.println(8^18);
    }
    public static int singleNumber(int[] arr){
        int sum=0;
        for(int i:arr) {
            sum = sum ^ i;
        }
        return sum;
    }
}
