package com.company;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int index =0;
        System.out.println(checkSortedArray(arr, index));
    }
    public static boolean checkSortedArray(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
//        if(arr[index] < arr[index + 1]){
//            return checkSortedArray(arr,index+1);
//        }
//        return false;
        return (arr[index] < arr[index+1] && checkSortedArray(arr,index+1));

    }
}
