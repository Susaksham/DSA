package com.company;

public class SearchInInfiniteLoop {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int target=2;
        System.out.println(ans(array,target));

    }
    static int ans(int[] array,int target){
        int start=0;
        int end=1;
        while(array[end]<target){//this loop will run until we dont find the target element in that range
            //when we will get the range we can easily find the element using binary search
            int newLow=end+1;
            end=end+(end-start+1)*2;//(end-start+1)*2 is basically size of the previous array we can also say that as
            //(end-(start-1))
            start=newLow;
        }
        int index=binarySearch(array,target,start,end);
        return index;

    }
    static int binarySearch(int[] array,int target,int start,int end){

        while(start<=end){
           int  mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;

            }
            else if(array[mid]>target){
                end=mid-1;
            }
            else if(array[mid]<target){
                start=mid+1;
            }


        }





        return -1;

    }
}
