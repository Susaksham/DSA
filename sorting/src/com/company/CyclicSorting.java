package com.company;


import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
//    int [] array = { 5,2,3,6,1,4,7};
        int [] array={4,3,2,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    //    static int[] cyclicSorting(int[] arr){
//        int n=arr.length;
//        int value=0;
//        while(value<n-1){
//            if(value==arr[value]-1){
//                value++;//it will increment when the element at that index is right
//            }
//            else{
//                int temp=arr[value];
//                arr[value]=arr[arr[value]-1];
//                arr[temp-1]=temp;//temp inside because arr[value] has been changed
//            }
//
//        }
//
//        return arr;
//    }
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
