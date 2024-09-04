package com.company;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6 , 5 , 4 , 3 , 2 , 1};
//        System.out.println(Arrays.toString(mergeSort(arr )));
    }
    public static int[] mergeSort(int[] arr){
        int mid = arr.length/2;
        if(arr.length == 1){
            return arr;
        }

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid+1));
       int[] right =  mergeSort(Arrays.copyOfRange(arr, mid + 1 , arr.length));


        return mergeArray(left , right);


    }
    public static int[] mergeArray(int[] arr1 , int[] arr2){
        int[] res = new int[arr1.length + arr2.length];

        int index = 0;
        int indexOf1 =0;
        int indexOf2 = 0;

        while(indexOf1 < arr1.length && indexOf2 < arr2.length){
            if(arr1[indexOf1] <= arr2[indexOf2]){
                res[index] = arr1[indexOf1];
                index++;
                indexOf1++;
            } else {
                res[index] = arr2[indexOf2];
                index++;
                indexOf2++;
            }
        }
        while(indexOf1 < arr1.length ){
            res[index] = arr1[indexOf1];
            index++;
            indexOf1++;
        }
        while(indexOf2 < arr2.length){
            res[index] = arr2[indexOf2];
            index++;
            indexOf2++;
        }
        return res;
    }
}
