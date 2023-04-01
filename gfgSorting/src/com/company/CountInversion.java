package com.company;

import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {
//        int[] array={174 ,165, 142, 212, 254, 369, 48, 145, 163, 258, 38, 360, 224, 242, 30, 279, 317, 36, 191, 343, 289, 107, 41, 443, 265, 149, 447, 306, 391, 230, 371, 351, 7, 102};
        int[] array = {5,4,3,2,1};
        countInversion(array, 0 ,array.length-1);
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
    static int count =0;
    public static void countInversion(int[] arr , int start , int end ){
        if(start >= end){
            return ;
        }
        else{
            int mid = start + (end -start)/2;
             countInversion(arr , start , mid);
             countInversion(arr, mid + 1 , end);

              mergeArray(arr , start , mid , end);

        }
    }
    public static void mergeArray(int[] arr , int start , int mid , int end){
        int[] arr1 = new int[mid - start + 1];
        int[] arr2 = new int[end - (mid + 1) + 1];
        int d = 0;
        int h=0;
        for(int i=start;i<=mid;i++){
            arr1[d++] = arr[i];
        }
        for(int j= mid + 1; j<=end ;j++){
            arr2[h++] = arr[j];
        }
        int first =0;
        int second =0;

        int k = start;
        while(first < arr1.length  && second < arr2.length ){
            if(arr1[first] <= arr2[second]){
                arr[k] = arr1[first];
                k++;
                first++;

            }
            else{
                arr[k] = arr2[second];
                k++;
                second++;
                count = count + (arr1.length - first); /* here whenever the small element is in the second array
                then from the element on which the pointer is in the first array to the end of the first array
                all elements will be greater than current element in second array so i added all of them in the count*/
            }
        }
        while(first < arr1.length ){
            arr[k] = arr1[first];
            k++;
            first++;
        }
        while(second < arr2.length){
            arr[k] = arr2[second];
            k++;
            second++;
        }

    }
}
