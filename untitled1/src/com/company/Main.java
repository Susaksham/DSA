package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={6,5,5};
        System.out.println(majorityElement(nums));
//
    }
    public static int majorityElement(int[] nums) {
        int maxOccurance=1;
        int maxOccured=nums[0];
        for(int i=0;i<nums.length-1;i++){
            int count=1;
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(maxOccurance<count){
                maxOccurance=count;
                maxOccured=nums[i];
            }
        }
        return maxOccured;
    }

    }

