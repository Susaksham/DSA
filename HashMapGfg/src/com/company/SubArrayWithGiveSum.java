package com.company;

import java.util.HashSet;

public class SubArrayWithGiveSum {
    public static void main(String[] args) {
        int[] arr = {1,4,13,-3,-10,5};
        int sum = 10;
        System.out.println(subArrayWithGivenSum(arr , sum));

    }
    public static boolean subArrayWithGivenSum(int[] arr , int givenSum){
        int sum = arr[0];
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            sum = sum + arr[i];
            if(set.contains(sum - givenSum )){
                return true;
            }
            if( sum == givenSum){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
