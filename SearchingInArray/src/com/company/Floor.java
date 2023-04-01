package com.company;

public class Floor {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,6,9,11};
        int target=4;
        System.out.println(floor(arr,target));
    }
    //returning the index of the largest number smaller than target number
    //if the target number is smaller than the smallest number of the array then it will return -1
    static int floor(int[] array,int target){
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
        return high;//returning the index of the largest number smaller than target number

    }
}
