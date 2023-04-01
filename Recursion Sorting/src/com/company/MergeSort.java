package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]){
    int[] array = {5,4,3,2,1 };
//    array =mergeSort(array);
//        System.out.println(Arrays.toString(array));
        mergeSortInPlace(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));/*here it is creating a new array every time and sending in the
        in the function */
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid ,arr.length ));

        return merge(left, right);


    }
    public static int[] merge(int[] first , int[] second ){
        int[] mix = new int[first.length + second.length];
       int i =0;
       int j=0;
       int k=0;
       while((i<first.length) && (j<second.length)){
           if(first[i]>second[j]){
               mix[k] = second[j];
               k++;
               j++;
           }
           else{
               mix[k] = first[i];
               i++;
               k++;
           }
       }
       //it is possible that one of the array is not complete
        //copy the remaining element
        while(i< first.length){
            mix[k]= first[i];
            k++;
            i++;
        }
        while(j< second.length){
            mix[k]= second[i];
            k++;
            j++;
        }

       return mix;

    }
}
