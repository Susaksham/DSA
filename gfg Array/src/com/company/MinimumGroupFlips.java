package com.company;

public class MinimumGroupFlips {
    public static void main(String[] args) {
        int[] arr ={0,0,1,1,0,0,1,1,0};
    minimumGroupFlips(arr);
    }
    public static void minimumGroupFlips(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] !=arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("start from " + i);
                }
                else{
                    System.out.println(" and end to " + (i-1));
                }
            }
        }
    }
}
