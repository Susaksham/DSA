package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SortArrayWithTwoTypes {
    public static void main(String[] args) {
        int[] arr = {15,-3,-2,18};
        sortArrayWithTwoTypes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortArrayWithTwoTypes(int[] arr ){
        int i=-1;
        for(int j=0;j<arr.length ;j++){
            if(arr[j] < 0){
                i++;
                swap(arr ,j , i);
            }
        }
    }
    public static void swap(int[] arr , int index , int index2){
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }
}
