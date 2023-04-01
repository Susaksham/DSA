package com.company;

public class TappingRainWater {
    public static void main(String[] args){
        int[] arr = {3,0,1,2,5};
        System.out.println(tappingRainWaterOptimized(arr));
    }
    /*<--------------------------- TIME COMPLEXITY : - O(N) ---------------->*/
    public static int tappingRainWaterOptimized(int[] arr){
        int res=0;
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        int lmax = arr[0];
        leftMax[0] = arr[0];
        int lk =0;
        int rk=0;
        //for every element we are storing the left side max element
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(lmax , arr[i]);
        }
        //for every element we are storing the right side max element
        int rmax = arr[arr.length-1];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            rightMax[j] = Math.max(rmax,arr[j]);
        }
        /*here we are taking the minimum of the leftMax and rightMax of the current element
         and then subtracting it from the current element*/
        for(int k=1;k<arr.length-1;k++){/*we are only checking for the middle element because we cannot store water on the corner
            element*/
            res = res+(Math.min(rightMax[k], leftMax[k]) - arr[k]);
        }
        return res;
    }

    /*<--------------------------- TIME COMPLEXITY : - O(N^2) ---------------->*/
    public static int tappingRainWater(int[] arr){
        int res =0;//amount water we can store in it
        for(int i=1;i<arr.length-1;i++){//this for the element between both the corner
            /*for every element we are going to check the leftmax and rightMax
            whatever will be the minimum from both leftMax and rightMax .... we will subtract from the current element*/
            int leftMax =arr[i];
            for(int left =0;left<i;left++){
                leftMax = Math.max(leftMax , arr[left]);
            }
            int rightMax = arr[i];
            for(int right = i+1;right<arr.length;right++){
                rightMax = Math.max(rightMax, arr[right]);
            }
            res = res + (Math.min(leftMax , rightMax) - arr[i]);
        }
        return res;
    }



}
