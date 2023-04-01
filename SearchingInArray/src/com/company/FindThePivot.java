package com.company;

public class FindThePivot {
    public static void main(String args[]){
        //1 2 3 4 5
        int array[]={1,2,3,5};
        System.out.println(findPivot(array));

    }
    public static int findPivot(int[] array){
        int start =0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(end>mid && array[mid]>array[mid+1]){
                return mid;
            }
            if(start <mid && array[mid]<array[mid-1]){
                return mid;
            }
            else if(array[start]<=array[mid]){
                start=mid+1;//i know here that the mid+1 is not the smaller number than the mid element it means it can't
                // be the answer so mid+1
            }
            else if(array[start]> array[mid]){
                end=mid-1;
            }




        }

        return -1;


    }
}
