package com.company;

public class InsertionSort {
    public static void main(String args[]){
        int[] arr={2,5,4,1,7,8};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];//if 1 means i=3
            int j=i-1;//4
            while( j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;

        }
        for(int i:arr){
            System.out.println(i);
        }

    }
}
