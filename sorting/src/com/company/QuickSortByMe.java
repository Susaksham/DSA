package com.company;

import java.util.Arrays;

public class QuickSortByMe {
    public static void main(String[] args) {
        int[] arr = { 1 , 5, 2, 10 , 3, 6};
        System.out.println(hoarsePartition(arr , 0 , arr.length - 1));
        System.out.println(Arrays.toString(arr));
        quickSort(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort (int[] arr , int start , int end){
        if( start < end){
            int partition = hoarsePartition(arr , start , end);

            quickSort(arr , start , partition);
            quickSort(arr , partition + 1 , end);
        }

    }
    public static int hoarsePartition (int[] arr , int start , int end ){
            int pivot = arr[start];
            int startingIndex = start - 1;
            int endingIndex= end + 1;
            while (true){

               do{
                    startingIndex++;
                } while(arr[startingIndex] < pivot);
                do {
                    endingIndex--;
                }while (arr[endingIndex] > pivot);
                if(startingIndex < endingIndex){
                    //swap
                    int firstElement = arr[startingIndex];
                    arr[startingIndex] = arr[endingIndex];
                    arr[endingIndex] = firstElement;

                }
                else{
                    return endingIndex;
                }
            }

    }
}
