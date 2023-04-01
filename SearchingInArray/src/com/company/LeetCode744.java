package com.company;

public class LeetCode744 {
    public static void main(String[] args) {
        char[] arr=new char[]{'c','f','j'};
        char target='j';
        System.out.println(ceiling(arr,target));
    }
    //returning the index of the smallest number greater than target number
    // if the target is greater than the largest element in the array then it will return -1
    static char ceiling(char[] array,char target){
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;

           if((array[mid]>target)){
                high=mid-1;
            }

            else{
                low=mid+1;//we just have to give attention when low,high and mid are equal at that time i want low=mid+1
            }



        }

        return array[low % array.length];//returning the index of the smallest number greater than target number

    }
}
//if(target>array[mid]){low=mid+1;} else{high=mid-1}// will cause problem because when target will be equal to the mid at
// at the last time it will return the target element
