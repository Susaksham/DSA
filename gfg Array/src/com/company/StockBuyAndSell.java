package com.company;

public class StockBuyAndSell {
    public static void main(String args[]){
        int[] arr ={1,5,3,8,12,23,100};
        System.out.println(stockBuyAndSell(arr, 0 , arr.length-1));
    }
    public static int stockBuyAndSell(int[] arr , int start , int end){
        if(start >=end){
            return 0;
        }
        int maxProfit =0;
        for(int i=start ; i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j] > arr[i]){
                    int currentProfit = arr[j] - arr[i] + stockBuyAndSell(arr , start ,i-1) + stockBuyAndSell(arr,j+1,end);
                    maxProfit = Math.max(maxProfit , currentProfit);
                }

            }

        }
        return maxProfit;
    }
}
