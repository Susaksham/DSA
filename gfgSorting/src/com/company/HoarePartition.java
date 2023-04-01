package com.company;

import java.util.Arrays;

public class HoarePartition {
    public static void main(String[] args) {
    int[] arr = {1,0,0,2,1,2};
        System.out.println(hoarePartition(arr, 0 , arr.length-1 , 0));;
        System.out.println(Arrays.toString(arr));
    }
    public static int hoarePartition(int[] arr , int l , int h , int index){
        int pivot = arr[index];
        int i= l-1;
        int j= h+1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;

            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            swap(arr , i , j);
        }
    }
    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
