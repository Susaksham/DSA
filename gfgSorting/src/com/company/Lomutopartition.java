package com.company;

import java.util.Arrays;

public class Lomutopartition {
    public static void main(String[] args) {
    int[] arr = {10,80,30,90,40,50,70};
        System.out.println(lomutoPartition(arr, 3, 0, arr.length-1));;
        System.out.println(Arrays.toString(arr));
    }
    public static int lomutoPartition(int[] arr , int index , int l, int h){
        int pivot = arr[index];
        swap(arr, index , arr.length-1);
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
