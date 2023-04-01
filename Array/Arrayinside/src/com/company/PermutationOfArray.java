package com.company;
// In this question we will pass different type of array in command line input it will give us different different array
public class PermutationOfArray {

        public int[] buildArray(int[] nums) {
            int[] ans= new int[nums.length];
            for(int i=0;i<nums.length;i++){
                ans[i]=nums[nums[i]];
            }
            return ans;

        }

}
