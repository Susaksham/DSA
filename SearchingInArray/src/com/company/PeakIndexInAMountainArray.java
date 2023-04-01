package com.company;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        //int[] array={1,2,3,4,5,6};
        int[] array={8,7,6,5,4,3,2,1};
        System.out.println(peakIndex(array));
    }
     public static int peakIndex(int[] array){
        int start=0;
        int end=array.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(start==end){
                return mid;
                //start and end are always trying to find the max element according two the below checks
                //hence we know that we are always pointing to the same check,that is the max element
                // more elaboration: at every point of time for start and end, they have the best possible answer till that time
                // more elaboration: at every point of time for start and end, they have the best possible answer till that time
                // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
            }


            if(array[mid]<array[mid+1]){
                start=mid+1;
                // you are in the increasing array
                //because we know that mid+1 element > the middle element
                //so i know that on the right side of the peak the element is be smaller than the peak element so
                // start=mid+1;

            }
            else if(array[mid]>array[mid+1]){
                end=mid;
                //you are in the dec array
                //this may be the possible answer but look left
                //this is why end!=mid-1
                //because we dont know whether array[mid-1] is greater than array[mid] because there can be possiblity
                //that there can be array[mid-1] is smaller than the array[mid] this means that is the answer
            }

        }
        return -1;
    }
}
