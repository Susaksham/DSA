package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,0,-1};
        System.out.println(Arrays.toString(selectionSort(arr, 0 , 1, 0)));
    }
    public static int[] selectionSort(int[] arr,int smallestElementIndex ,int start , int intitial){
        if(intitial == arr.length){
            return arr;
        }
        else if(start == arr.length){
            int temp = arr[intitial];
            arr[intitial] = arr[smallestElementIndex];
            arr[smallestElementIndex] = temp;
            return selectionSort(arr, intitial+1 ,intitial+2,intitial+1);
        }
        else if(arr[smallestElementIndex] > arr[start]){
            smallestElementIndex =start;
        }

        return selectionSort(arr, smallestElementIndex , start+1, intitial);
    }
}
