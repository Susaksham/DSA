package com.company;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
//        int[] arr ={1,4,4,1,0,1};
        int[] arr = {3,4,3,3,3,3,4,6,7,6,8,7};
//        naive(arr, 5);
//        countSort(arr , 5);
        countSortForRangeOfK(arr, 5 , 3, 8);

        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] arr , int k){
        int[] count = new int[k];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;// here we are storing the count of the every element in the array
        }
        for(int j=1;j<count.length;j++){
            count[j] = count[j] + count[j-1];/* here we are storing the count at every index of element equal to that index
             and smaller than that index */
        }
        int[] output = new int[arr.length];
        for(int g=arr.length-1 ;g>=0;g--){// it is important to start from the last index in order to keep the  algorithm stable
            output[count[arr[g]]-1] = arr[g];/* here we are first taking the value from array then the value in the form
             index in the count array will store the element count that will be equal to that index and less than
             this means at that position we can store the element .... index will be position = index-1
            */
            count[arr[g]]--;
        }
        for(int f=0;f<arr.length;f++){
            arr[f] = output[f];
        }
    }
    public static void countSortForRangeOfK(int[] arr , int k , int start , int end){
        int[] count = new int[end-start + 1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]-start]++;
        }
        for(int j=1;j<count.length;j++){
            count[j] = count[j] + count[j-1];
        }
        int[] output= new int[arr.length];
        for(int g=arr.length-1;g>=0;g--){
            output[count[arr[g]- start]-1] = arr[g];
            count[arr[g] - start]--;
        }
        for(int f=0;f<arr.length;f++){
            arr[f] = output[f];
        }
    }
    public static void naive(int[] arr , int k){

        //timeComplexity of this part = O(n)
        int[] temp = new int[k];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        int index=0;
        //timeComplexity of this part = O(n+k)
        for(int j=0;j<k;j++){// this is going to run for the k times
            for(int g=0;g<temp[j];g++){// this is going to run for the n times
               arr[index] = j;
               index++;
            }
        }
    }
}
