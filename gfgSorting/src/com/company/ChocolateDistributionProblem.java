package com.company;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr = {3,4,1,9,56,7,9,12};
        int k = 5;
        System.out.println(minmumChocolateDifference(arr, k));;
    }
    public static int minmumChocolateDifference(int[] arr , int k){
        Arrays.sort(arr);
        int i=0;
        int j = i + k -1;
        int minDifference = Integer.MAX_VALUE;
        while(j < arr.length){
            int currentDiffernce = arr[j] - arr[i];
            minDifference = Math.min(minDifference , currentDiffernce);
            i++;
            j++;

        }
        return minDifference;
    }
}
