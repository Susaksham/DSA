package com.company;

import java.nio.file.StandardWatchEventKinds;
import java.util.ArrayList;
import java.util.Stack;

public class LargestRectAreaInHistogram {
    public static void main(String[] args) {
//    int[] arr = {60 , 20 , 50, 40 , 10, 50, 60};
    int[] arr = {9 ,10 ,4 ,10 ,4 ,5 ,16};


        System.out.println(
    naive(arr));
        System.out.println(largestRectAreaInHistogramBetterSolution(arr));
        System.out.println(largestRectAreaInHistogramBestSolution(arr));
    }
    public static int largestRectAreaInHistogramBestSolution( int[] arr){
    Stack<Integer> stack = new Stack<>();
    int maxArea = Integer.MIN_VALUE;
    for(int i=0; i < arr.length; i++){
        while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
            int proccessingElement = stack.pop();/* this element will be removed from the stack because the current index element
             is smaller than popped element , that popped element has next smallest element as current element
             and previous smallest index element as stack.peek ( because this will be smaller than popped element as it is before in that
              stack)

              if there is no element left in the stack after popping an element it means that it is the smallest element so far
              we have seen so it should be multiply  with index of the next current smallest element as it will become the
              length of the smallest element */
          int currentArea =   arr[proccessingElement] *(stack.isEmpty()? i : ( i - stack.peek() - 1));
          maxArea = Math.max(currentArea , maxArea);
        }

        stack.push(i);
         /*there can be a possibility that some elements are left in the stack as not processed element and these
        element will be those element that does not have any smaller element on the right side of it
        so area will be from that element to the last element
        */


    }
        while(!stack.isEmpty()){
            int processingElement = stack.pop();
            int currentArea = arr[processingElement] *( stack.isEmpty() ? arr.length : arr.length - 1 - stack.peek());
            maxArea = Math.max(currentArea , maxArea);
        }
        return maxArea;
    }
    public static int largestRectAreaInHistogramBetterSolution(int[] arr){
        Stack<Integer> leftNearestSmallestElement = new Stack();
        Stack<Integer> rightNearestSmallestElement  = new Stack();
        int[] leftArr = new int[arr.length];
        int[] rightArr = new int[arr.length];
        int leftIndex = 0;
        int rightIndex = 0;
        leftNearestSmallestElement.push(0);
        rightNearestSmallestElement.push(arr.length - 1);
        for(int i=1; i< arr.length; i++){
            while((!leftNearestSmallestElement.isEmpty()) && (arr[i] < arr[leftNearestSmallestElement.peek()])){
                leftNearestSmallestElement.pop();
            }
            leftArr[leftIndex++] = leftNearestSmallestElement.isEmpty() ? -1 : leftNearestSmallestElement.peek();
            leftNearestSmallestElement.push(i);
        }
        for(int j=arr.length -2 ; j>=0; j--){
            while(!rightNearestSmallestElement.isEmpty() && (arr[j] < arr[rightNearestSmallestElement.peek()])){
                rightNearestSmallestElement.pop();
            }
            rightArr[rightIndex++] = rightNearestSmallestElement.isEmpty() ? arr.length : rightNearestSmallestElement.peek();
            rightNearestSmallestElement.push(j);
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int currentArea = arr[i];
            if(leftArr[i]>=0 && (leftArr[i] + 1) < currentArea){
                currentArea = currentArea + (i -1 - leftArr[i])*arr[i];

            }
            if((rightArr[i] < arr.length) &&(rightArr[i] - 1) < currentArea){
                currentArea = currentArea + (rightArr[i]  - 1 - i ) * arr[i];
            }
            maxArea = Math.max(maxArea , currentArea);
        }
        return maxArea;
    }
    public static int naive( int[] arr){
        int largestArea = Integer.MIN_VALUE;
        for( int i=0; i<arr.length; i++){
            int currentLeftArea = 0;
            int currentRightArea = 0;
            int left = i-1;
            int right = i + 1;
            while( left >=0 && (arr[left] >=  arr[i])){
                currentLeftArea += arr[i];
                left--;
            }

            while( right < arr.length && (arr[right] >=  arr[i])){
                currentRightArea += arr[i];
                right++;
            }
            int  currentTotalArea = currentLeftArea + currentRightArea + arr[i];
            largestArea = Math.max(largestArea , currentTotalArea);
        }
        return largestArea;
    }

}
