package com.company;

public class MaximumSumSubArray {
    public static void main(String[] args){
        int a[]= {-10,-1};
        System.out.println(maximumSumSubArray(a));
        /*what we are trying to do is that ..... if the sum of the previous element + current element is smaller than the current element
        this means that when array will start from the current Index it will have better chances of being maximum sum arrray*/
        System.out.println(maxSubArraySum(a));
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
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
