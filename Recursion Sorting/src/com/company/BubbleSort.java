package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
        int[] array={1,3,5,2,4,0,-1};
        System.out.println(Arrays.toString(bubbleSort(array, 1, array.length-1)));
    }
    public static int[] bubbleSort(int[] arr, int start , int end){
        if(end==0){
            return arr;
        }
        else if(start > end){
            return (bubbleSort( arr, 1, end-1));
        }
        else if(arr[start-1] > arr[start]){
            int temp = arr[start-1];
            arr[start-1] = arr[start];
            arr[start] = temp;
           return bubbleSort(arr,start+1, end);
        }
        
        return bubbleSort(arr, start+1,end);
        
    }
}
