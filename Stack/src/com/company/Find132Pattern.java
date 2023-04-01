package com.company;

import java.util.Stack;

public class Find132Pattern {
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 0, 3};
        System.out.println(find132pattern(arr));
    }
    public static boolean find132pattern( int[] nums){
        int numsk = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack();
        for(int idx = nums.length-1;idx>=0;idx--){
            if(nums[idx]<numsk) return true;  // nums[i] < nums[k] , and nums[j] (potential) was chosen in previous iteration so given condition reached
            while(!st.isEmpty()&&nums[idx]>st.peek()){//nums[idx] = nums[j] (potential)
                numsk = st.pop(); // always bigger than previous numsk
            }
            st.push(nums[idx]);
        }
        return false;
    }
}
