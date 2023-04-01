package com.company;

import java.util.Arrays;

public class MedianOfARowWiseSortedMatrix {
    public static void main(String[] args) {
    int[][] array = {
            {1,10,20},
            {15,25,35},
            {5,30,40}
    };
        System.out.println(median(array));
    }
    public static int median (int[][] arr ){
        int[] temp = new int[arr.length * arr[0].length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                temp[index++] = arr[i][j];

            }
        }
        int medianIndex = ( arr.length * arr[0].length)/2;
        int value = helperFunction(temp , medianIndex , 0 , temp.length-1);
        System.out.println(Arrays.toString(temp));
        return value;


    }
    public static int helperFunction (int[] arr , int index , int start , int end){
        int value = lomutoPartition(arr , start , end);
        if(value == index){
            return arr[index];
        }
        if(value > index){
            return helperFunction(arr , index , start , value -1);
        }
       return  helperFunction(arr , index , value + 1 , end);

    }
    public static int lomutoPartition(int[] arr  , int start , int end){
        int correctIndex = start -1;
        int element = arr[end];
        for(int i=start; i<end;i++){
            if(arr[i] < element){
                correctIndex++;
                swap(arr , i , correctIndex);
            }
        }
        swap(arr , correctIndex+ 1 , end);
        return correctIndex + 1;
    }
    public static void swap( int[] arr , int  i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
