package com.company;

public class SearchInRotatedArray {

    //this will not work for the duplicated arrays
    public static void main(String[] args){
        int[] array={6,6,7,7,8,8,9,1,2,3,4,5};
        int target=1;
        System.out.println(search(array,target));

    }
   static  public int search(int[] nums, int target) {
        int pivotPoint=findPivotElement(nums);
        if(pivotPoint==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        else if(nums[pivotPoint]==target){
            return pivotPoint;
        }
        else if(nums[0]<=target){
            return binarySearch(nums,target,0,pivotPoint-1);
        }
        else if(nums[0]>target){
            return binarySearch(nums,target,pivotPoint+1,nums.length-1);
        }
        return -1;

    }
   static public int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;

            }
            else if(nums[mid]<target){
                start=mid+1;
            }





        }
        return -1;
    }

    static public int findPivotElement(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]<=nums[mid]){
                start=mid+1;
            }
            else if(nums[start]>nums[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}
