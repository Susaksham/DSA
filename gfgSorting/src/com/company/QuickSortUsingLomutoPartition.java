package com.company;

import java.util.Arrays;

public class QuickSortUsingLomutoPartition {
    public static void main(String[] args) {
        int[] arr = {23,2,4,0,-1,6,10,4};
    quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int l , int h){
        if(l<h){
            int p = lomutoPartition(arr , l , h);
            quickSort(arr , l , p-1);
            quickSort(arr , p + 1 , h);
        }
    }
    public static int lomutoPartition(int[] arr , int l, int h){
        int pivot = arr[h];

        int i= l-1;
        for(int j=l ; j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i, j);
            }
        }
        swap(arr, i+1, h);
        return (i+1);
    }
    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
