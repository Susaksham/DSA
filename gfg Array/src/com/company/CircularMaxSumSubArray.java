package com.company;

public class CircularMaxSumSubArray {
    public static void main(String[] args){
        int[] arr ={10,5,-5};
        System.out.println(circularMaxSum(arr));
        System.out.println(circularMaxSumSubArrayOptimized(arr));
    }
    public static int circularMaxSumSubArrayOptimized(int[] arr){
        /* so the max of the sum of the circular array is the total sum of the array - sum of the minimum subarray sum
        that will be the max of the only subarrays that are rotated*/
        //max of the maximumSumSubArray the circular array subarray sum  is the ans of the circularMaxSumSubArray

        //sum of the all the elements
        int totalsum =0;
        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];

        }
        if(maximumSumSubArray(arr)<0){
            return maximumSumSubArray(arr);
        }
        int onlyCircularArraySum = totalsum - minimumSumSubArray(arr);
        return Math.max(onlyCircularArraySum , maximumSumSubArray(arr));
    }
    public static int minimumSumSubArray(int[] arr){
        int currentMinimum=arr[0];
        int minimum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentMinimum = Math.min(currentMinimum + arr[i] , arr[i]);
            minimum = Math.min(minimum,currentMinimum);
        }
        return minimum;
    }
    public static int maximumSumSubArray(int[] arr){
        int currentMax =arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            currentMax = Math.max(currentMax + arr[i] , arr[i]);/*here what we are doing ,,, first either we add the new element in the sum of
            previous array  or i start the new subarray from that point*/
            max= Math.max(currentMax, max);//this thing will keep the track of the maximum sum
        }
        return max;
    }
    public static int circularMaxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum = arr[i];
            maxSum = Math.max(maxSum,currentSum);
            int j= (i+1)%arr.length;
            while(i!=j){
                currentSum = currentSum + arr[j];
                maxSum = Math.max(currentSum,maxSum);
                j= (j+1)%arr.length;
            }
        }
        return maxSum;
    }
}
