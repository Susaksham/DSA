package com.company;

import java.util.HashSet;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
    int[] arr = {1,4,13,-3,-10,5};
        System.out.println(subArrayWith0Sum(arr));
    }
    public static boolean subArrayWith0Sum(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(set.contains(sum)){
                return true;
            }
            if(sum == 0){// if the current sum becomes zero from the starting
                return true;
            }
            set.add(sum);// we are storing the prefix sum
        }
        return false;
    }
}
