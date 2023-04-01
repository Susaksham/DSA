package com.company;

import java.util.Arrays;

public class leftRotate {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        int pos = 8 ;
        rotateLeft(arr , pos % arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateLeft(int[] arr , int pos){
        reverse(arr , 0 , arr.length -1);
        reverse(arr , 0 , arr.length - 1 - pos);
        reverse(arr, arr.length - pos , arr.length-1);
    }
    public static void reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
