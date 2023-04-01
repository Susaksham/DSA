package com.company;

public class LeetCode744AlternativeButWrong {
    public static void main(String[] args) {
        char[] arr=new char[]{'c','e','e','e','e','n','n','n'};
        char target='e';
        System.out.println(ceiling(arr,target));
    }

    static char ceiling(char[] array,char target){
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(target==array[mid]){
                if(mid==array.length-1){
                    return array[0];
                }
                else{
                    return array[mid+1];
                }
            }

            else if((array[mid]>target)){
                high=mid-1;
            }

            else if(array[mid]<target){
                low=mid+1;
            }



        }

        return array[low % array.length];//returning the index of the smallest number greater than target number

    }
}
