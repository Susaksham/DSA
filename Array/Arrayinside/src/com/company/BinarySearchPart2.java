package com.company;

public class BinarySearchPart2 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,8,10};
        int target=8;

        int low=0;
        int high=nums.length-1;
        int mid=0;
        int count=1;
        int[] newArray={-1,-1};
        int indexOfThatValue=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                newArray[1]=mid;
                low=mid+1;



            }

            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }

        }








        low=0;
        high=nums.length-1;
        mid=0;
        count=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                newArray[0]=mid;
                high=mid-1;



            }

            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }

        }



        System.out.println(newArray[0]);
        System.out.println(newArray[1]);

    }
}


