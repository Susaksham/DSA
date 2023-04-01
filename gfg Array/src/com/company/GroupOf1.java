package com.company;

public class GroupOf1 {
    public static void main(String[] args) {
        int[] arr ={0,0,1,1,0,0,1,1,0};
        System.out.println(group(arr));;
    }
    public static int group(int[] arr){
        int group=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[0] ==1){
                group++;
            }
            else if(arr[i] ==1 && arr[i-1]!=1){
                group++;
            }
        }
        return group;
    }
}
