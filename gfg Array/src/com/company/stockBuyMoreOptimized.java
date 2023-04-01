package com.company;

public class stockBuyMoreOptimized {
    public static void main(String[] args) {
        int[] arr ={1,5,3,8,12,23,100};
        System.out.println(stockBuy(arr));
    }
    public static int stockBuy(int[] arr){
        int profit =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                profit = profit + (arr[i+1]- arr[i]);
            }
        }
        return profit;
    }
}
