package com.company;

public class BinarySearch {
    public static void main(String args[]){
        int[] sortedArray=new int[]{1,2,3,5,6,9,23,90};
        int target=21;
        System.out.println(binarySearch(sortedArray,target));

    }
    static int binarySearch(int[] array,int target){
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

        return -1;

    }
}
