package com.company.SlidingWindow;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args){
    int[] arr ={2,3,-8,7,-1,2,3};
        System.out.println(sliding(arr,4));
    }
    public static int sliding(int[] arr , int k){
        int maxSum =Integer.MIN_VALUE;//max sum of the window till now
        int previousSum = 0;//sum of the previous window
        int i=0;//start of the window
        int j=0;// end of the window

        while(i<arr.length && j<arr.length){//we will keep on doing until the j is less than the length of the array
            if((j-i + 1 )< k){//here until the size the window is not equal to k ,  keep on increasing the size of the window
                previousSum = previousSum + arr[j];// add the sum of the current window
                j++;
            }
            else if(((j-i + 1)==k) && (i==0)){// when the size of the window is equal to specified size
                previousSum = previousSum + arr[j];// just add the last element in the first window
                i++;//move the start of the same  window forward
                j++;//move the last of the same window forward
                maxSum = Math.max(previousSum , maxSum);// store the max between the first window and minimum value
            }
            else if(((j-i + 1)==k) && (i>0)){
                int currentSum = previousSum + arr[j] - arr[i-1];
                maxSum = Math.max(maxSum ,currentSum);
                previousSum = currentSum;
                i++;
                j++;
            }
        }
        return maxSum;

    }
    public static int slidngWindowGfg(int[] arr, int n, int k){
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];//we first added the element of the first window

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {//then we start from the first element after the first window .....i added that element in the previous window then
            //removed it by using this arr[i - k]
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }
}
