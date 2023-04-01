package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,5,6,7,8};
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int count=0;
        int target =6;

        int indexOfThatValue=0;





        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                System.out.println(mid);



            }

            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
    }
}
