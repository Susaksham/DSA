package com.company;

public class MaxDiff {
    public static void main(String[] args){
        int[] arr ={2,3,10,6,4,8,1};
        System.out.println(maxDiff(arr));
    }
    public static int maxDiff(int[] arr){
        int min = arr[0];
        int maxDifference = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if((arr[i] - min) >maxDifference){
                maxDifference = arr[i] - min;
            }
            if(arr[i] < min){

                min= arr[i];
            }
        }
        return maxDifference;
    }
}
