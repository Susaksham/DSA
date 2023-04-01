package com.company;

public class OrderAgnosticBinarySearch {
    public static void main(String args[]){
//        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] array=new int[]{10,9,8,7,6,5,4,3,2,1};
        int target=3;
        System.out.println(orderAgnosticBinarySearch(array,target));

    }
    static int orderAgnosticBinarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        boolean inAsc=arr[0]<arr[high];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid+1;
            }
            if(inAsc){
                if(arr[mid]>target){
                    high=mid-1;

                }
                else if(arr[mid]<target){
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]>target){
                    low=mid+1;
                }
                else if(arr[mid]<target){
                    high=mid-1;
                }
            }
        }

        return -1;
    }
}
