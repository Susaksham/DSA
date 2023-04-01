package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
    int[] arr = {1,9,3,4,2,20};
//        System.out.println(longest(arr));
        System.out.println(naive(arr));
    }


    public static int naive(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == (arr[i-1]+1)){
                count++;
            }
            else{
                result = Math.max(result , count);
                count=1;
            }
        }
        return result;
    }
}
