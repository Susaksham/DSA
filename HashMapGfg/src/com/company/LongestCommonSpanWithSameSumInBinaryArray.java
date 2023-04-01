package com.company;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArray {
    public static void main(String[] args) {

    }
    public static int efficient(int[] arr1 , int[] arr2){
        int[] temp = new int[arr1.length];
        for(int i=0;i< arr1.length;i++){
            temp[i] = arr1[i] - arr2[i];
            // here we have stored the difference of both the array into one array
            // we will find the subarray that will make differences of both the array to zero


        }
        HashMap<Integer , Integer> map = new HashMap<Integer,Integer>();
        int prefixSum = 0;
        int res = 0;
        for(int i=0;i<temp.length;i++){
            prefixSum = prefixSum + temp[i];
            if(prefixSum == 0){
                res = Math.max(res , i-0 + 1);
            }
            if(map.containsKey(prefixSum)){
                res = Math.max(res , i- (map.get(prefixSum)));

            }
            if(map.containsKey(prefixSum) == false){
                map.put(prefixSum , i);
            }
        }
        return res;
    }
    public static int naive(int[] arr1 , int[] arr2 ){
        int res = 0;
        for(int i=0; i<arr2.length ; i++){
            int sum1 = arr1[i],sum2 =arr2[i];
            for(int j=i+1;j<arr2.length;j++){
                sum1 +=arr1[j];
                sum2 +=arr2[j];
                if(sum1 == sum2){
                    res = Math.max(res , j-i +1);
                }
            }
        }
        return res;

    }
}
