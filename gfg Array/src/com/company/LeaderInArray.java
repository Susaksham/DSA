package com.company;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10 , 6, 5,2};
        leaderInArray(arr);
    }
    public static void leaderInArray(int[] arr){
        int leader = arr[arr.length -1];
        System.out.println(leader);
        for(int i = arr.length -2 ;i>=0;i--){
            if(arr[i] > leader){
                System.out.println(arr[i]);
                leader = arr[i];
            }
        }
    }
}
