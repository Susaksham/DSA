package com.company;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
    int[] arr = {0,1,0,2,1,2};
    dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void dutchNationalFlag(int[] arr ){
        int l=0;// this is the index where we want to add the zero
        int hi = arr.length-1;// this is the index where we want to add the 2
        int mid =0;// this is the element that we are going to process
        while(mid<=hi){
            if(arr[mid] == 0){
                swap(arr , l , mid);
                l++;
                mid++;/*we will increase the middle because we know after swapping
                element that we will get at middle we be the part of the middle*/

            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr , mid , hi);
                hi--;
                /* here we will not incrase the middle because we dont know that after swapping the element at the middle
                is 0 1 or 2*/
            }
        }
    }
    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
