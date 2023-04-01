package com.company;

import java.util.HashMap;

public class dk {
    public static void main(String[] args) {
        long[] arr = {-4, -2, 1, -3};
        long n = 4;
        long k = 2;
        System.out.println(maxSumWithK(arr,n,k));
    }

    public static long maxSumWithK (long arr[], long n, long k)
    {
        long kadansmax = Long.MIN_VALUE;
        long currentkadans = 0;
        long currentSum = 0;
        long maxSum = Long.MIN_VALUE;
        int j=0;
        int i=0;
        HashMap<Integer,Long> map = new HashMap<Integer,Long>();
        if(k>n){
            return 0;
        }
        while(j<arr.length){
            currentkadans = currentkadans + arr[j];
            currentkadans = Math.max(currentkadans,arr[j]);
            kadansmax = Math.max(kadansmax , currentkadans);
            map.put(j , kadansmax);


            if((j-i+1)<k){
                currentSum = currentSum + arr[j];
                j++;
            }
            else if(i==0 && (j-i+1)==k){
                currentSum = currentSum + arr[j];
                maxSum = Math.max(maxSum , currentSum);
                j++;
                i++;
            }
            else if(i>0 && (j-i+1)==k){
                currentSum = currentSum + arr[j] - arr[i-1];
                long pointSum  = currentSum + map.get(i-1);
                long summm = Math.max(pointSum , currentSum);
                maxSum = Math.max(maxSum , summm);
                i++;
                j++;
            }
        }
        return maxSum;
    }
}
