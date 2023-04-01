package com.company;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5,8,-3,6};
        int sum =3;
        System.out.println(naive(arr, sum));
        System.out.println(efficiant(arr, sum));
    }
    public static boolean efficiant(int[] arr, int sum){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains((sum -arr[i]))){
//                System.out.println(arr[i] + "   " + (sum -arr[i]));
                return true;
            }
            else{
                set.add(arr[i]);
            }

        }
        return false;
    }
    public static boolean naive(int[] arr , int sum ){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i] + arr[j]) == sum){
                    return true;
                }
            }
        }
        return false;
    }

}
