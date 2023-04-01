package com.company;

import java.util.HashMap;

public class LengthOfLongestSubArray {
    public static void main(String[] args) {
    int[] arr = {8,3,1,5,-6,6,2,2};
    int sum = 4;
        System.out.println(lengthOfLongestSubArray(arr, sum));
    }
    public static int lengthOfLongestSubArray(int[] arr , int sum){

        HashMap<Integer, Integer> map2 = new HashMap<Integer , Integer>();
        int currentSum =0;
        int biggestDifference = 0;

        for(int i=0; i<arr.length;i++){
             currentSum = currentSum + arr[i];
             if(currentSum == sum){

                     biggestDifference = Math.max(biggestDifference , i-0+1);

             }
             if(map2.containsKey(currentSum - sum)){
                 int j = map2.get(currentSum - sum);// it is the index after which the subarray is starting
                 biggestDifference = Math.max(biggestDifference , (i-j));
             }
             if(map2.containsKey(currentSum) == false){/* there can  be a condition when prefix sum is repeating at that time we will not add that  in the map
                 because we want to keep the index to minimum so that will be used */
                 map2.put(currentSum , i);
             }

        }
        return biggestDifference;
    }
}
