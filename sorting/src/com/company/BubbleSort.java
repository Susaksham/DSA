package com.company;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//    int[] arr ={5,4,3,2,1};
        int[] arr={174 ,165, 142, 212, 254, 369, 48, 145, 163, 258, 38, 360, 224, 242, 30, 279, 317, 36, 191, 343, 289, 107, 41, 443, 265, 149, 447, 306, 391, 230, 371, 351, 7, 102};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        //run the steps n-1 times
        boolean swapped=false;
        for (int i=0;i<arr.length-1;i++){
            //for each step, max item will come at the last respective index
            for (int j=1;j<arr.length-i;j++){
                //swap if the items is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    swapped=true;
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            // if you did not swap for a particular swapped of i, it means the array the array is sorted
            if(!swapped){
                break;
            }


        }
    }
}