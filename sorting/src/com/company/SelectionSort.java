package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr={4,5,1,2,3};
//            int[] arr={5,4,3,2,1};
        int[] arr={2,-32,0,78,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){//n-1 {n is the length of the array -1
            int minValueIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minValueIndex]>arr[j]){
                    minValueIndex=j;
                }
            }
            //swap
            int temp=arr[minValueIndex];
            arr[minValueIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
