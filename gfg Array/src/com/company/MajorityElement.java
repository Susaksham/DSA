package com.company;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr ={1,2,4,1,3,4,5,5,5,5,5,5,6,6,6,6,6,6};
//        int majoriyElement = majoriyElement(arr);
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == majoriyElement){
//                count++;
//            }
//        }
//        if(count > (arr.length/2))
//        System.out.println(majoriyElement(arr));
//        else{
//            System.out.println(-1);
//        }


        System.out.println(majorityElementt(arr));
    }
    //majority element according to me that also works
    public static int majoriyElement1(int[] arr){
        int count=0;
        int candidate = 0;
        for(int index=0;index<arr.length;index++){
            if(count ==0){
                candidate = arr[index];
                count=1;
            }
            else if(candidate == arr[index]){
                count++;
            }
            else {
                count--;
            }
        }
        if(count ==0){
            return -1;
        }
        return candidate;
    }
    //majorityElements when n/3
    public static List<Integer> majorityElementt(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int first = 0;
        int second = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (first == nums[i]) {
                count1++;
            } else if (second == nums[i]) {
                count2++;

            } else if (count1 == 0) {
                first = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                second = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        int count3 = 0;
        int count4 = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == first) {
                count3++;
            } else if (nums[j] == second) {
                count4++;
            }
        }
        if (count3 > nums.length / 3) {
            list.add(first);
        }
        if (count4 > nums.length / 3) {
            list.add(second);
        }
        return list;
    }


        //voting algorithm
    public static int majoriyElement(int[] arr){
        int count=1;
        int candidate = arr[0];
        for(int index=1;index<arr.length;index++){

            if(candidate == arr[index]){
                count++;
            }
            else {
                count--;
            }
            if(count ==0){
                candidate = arr[index];
                count=1;
            }
        }
        if(count ==0){
            return -1;
        }
        return candidate;
    }

}
