package com.company;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,6,9,11};
        int target=4;
        System.out.println(ceiling(arr,target));
    }
    //returning the index of the smallest number greater than target number
    // if the target is greater than the largest element in the array then it will return -1
    static int ceiling(int[] array,int target){
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(array[mid]==target){
                return mid;

            }
            else if(array[mid]>target){
                high=mid-1;
            }
            else if(array[mid]<target){
                low=mid+1;
            }


        }
        if(low>array.length-1){
            return -1;
        }
        return low;//returning the index of the smallest number greater than target number

    }
}
