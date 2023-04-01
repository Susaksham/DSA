package com.company;

public class RBS {
    public static void main(String[] args) {
        int[] array = {5,6,7,1,2,3,4};
        System.out.println(search(array, 2, 0,6));
    }
    public static int search(int[] arr, int target , int start , int end){
        int mid = start +(end-start)/2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        //it will check if the middle element is present on the left side of the array
        else if(arr[mid] >= arr[start]){
            //if the element is between the start and the middle index on the left side of the array
           if(target >= arr[start] && target<= arr[mid]){
                return search(arr,target,start,mid-1);
            }
           //when the element is greater than the middle element of the left side of the array
           else{
               return search(arr,target,mid+1,end);
           }

        }
        //if the target element is between the middle and the end element on the right side of the array
        else if(target >= arr[mid] && target <=arr[end]){
            return search(arr,target,mid+1,end);
        }
        //otherwise always move to the center
            return search(arr,target,start,mid-1);


    }
}
