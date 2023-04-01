package com.company;

public class stockBuyOptimized {
    public static void main(String[] args) {
        int[] arr ={1,5,3,8,12,23,100};
        System.out.println(stockBuyOptimized(arr, 0 , arr.length-1));
    }
    public static int stockBuyOptimized(int[] arr , int start , int end){
        if(start >=end){
            return 0;//as there will be no max difference in one element
        }
        int maxProfit =0;
        int minimum = start;
        //this is the program to find the maximum difference in a particular array
        //so we know how to find the maximum difference in a particular array
        // we will add the sum of the previous maximum difference and after difference
        for(int i=start+1 ; i<arr.length;i++ ){
            int currentProfit =0;
            if(arr[i]<arr[minimum]){
                minimum = i;
            }
            else{
                 currentProfit = arr[i] - arr[minimum] + stockBuyOptimized(arr, start ,minimum-1) + stockBuyOptimized(arr,i+1,end);
            }
            maxProfit = Math.max(maxProfit , currentProfit);

        }
        return maxProfit;


    }
}
