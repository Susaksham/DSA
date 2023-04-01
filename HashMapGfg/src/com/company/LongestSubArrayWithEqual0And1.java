package com.company;

import java.util.HashMap;

public class LongestSubArrayWithEqual0And1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0,0,0,0,1,1,1,1,0};
        System.out.println(naive(arr));
        System.out.println(efficient(arr));
    }
    public static int efficient(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentSum = 0;
        int maxLength = 0;
        for(int i = 0; i<arr.length;i++){
            currentSum = currentSum + arr[i];
            if(currentSum == 0){
                maxLength = Math.max(maxLength , i+1);
            }
            if(map.containsKey(currentSum)){
                maxLength = Math.max(maxLength ,(( i -map.get(currentSum))));
            }
            if(map.containsKey(currentSum) == false){
                map.put(currentSum , i);
            }
        }
        return maxLength;
    }
    public static int naive(int[] arr){
        int maxLength = 0;
        for(int i=0;i<arr.length-1;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum = sum + arr[j];
                if((j-i + 1 ) % 2 == 0){
                    if( sum == ((j-i + 1)/2)){
                        maxLength = Math.max(maxLength , (j-i + 1));
                    }
                }

            }
        }
        return maxLength;
    }
}
