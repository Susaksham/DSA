package com.company;

public class NumberOfPages {
    public static void main(String[] args) {
        int[] arr = {12 , 34, 67 , 90};
        System.out.println(findPages(arr , arr.length , 2));
    }
    public static int findPages(int[]arr,int N,int M)
    {
        //Your code here
        /* minimum number of pages that can be allocated to any student will be
        the smallest element in the array*/
        int smallestElement = arr[0];
        for(int i=1 ; i<arr.length;i++){
            smallestElement = Math.min(smallestElement , arr[i]);

        }
        /* the maximum number of pages that can be allocated to any student will be
        the sum of the element in the array*/
        int last = arr[0];
        for(int i=1;i<arr.length;i++){
            last = last + arr[i];
        }
        int start = smallestElement;
        int end = last;
        int result =Integer.MAX_VALUE;

        while(start  <= end){



            int mid = start + (end - start)/2;
            int[] checkResult = check(arr , mid);
            if(checkResult[0] == M){
                end = mid -1;
                result = Math.min(result , arr[1]);
            }
            else if(checkResult[0] < M){
                end = mid -1;
            }
            else if(checkResult[0] > M){
                start = mid + 1;
            }
        }
        return result;

    }
    public static int[] check(int[] arr , int mid ){
        int maxSum = 0;
        int k = 1;
        int[] array = {k , maxSum};
        int tempSum =0;


        for(int i=0;i<arr.length;i++){
            if((tempSum +  arr[i]) > (mid)){
                k++;
                tempSum = 0;
            }

            tempSum += arr[i];
            maxSum = Math.max(maxSum , tempSum);


        }
        array[0]= k;
        array[1] = maxSum;
        return array;
    }
}
