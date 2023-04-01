package com.company;

public class PrefixSum {
    public static void main(String[] args) {
    int[] arr = {4,2,2};
        System.out.println(prefixSum(arr));
    }
    public static boolean prefixSum(int[] arr){
        int totalSum =0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        int leftSum =0;
        for(int j=0;j<arr.length;j++){
            if(leftSum == totalSum - arr[j] - leftSum){
                return true;
            }
            leftSum = leftSum + arr[j];

        }
        return false;
    }
}
