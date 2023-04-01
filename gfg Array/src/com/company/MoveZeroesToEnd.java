package com.company;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        /*moving all zeroes to the end of the array while keeping the order same*/
        int[] array ={1,2,0,-1,4,0,0,3 ,0};
        moveZero(array);
        System.out.println(Arrays.toString(array));

    }
    public static void moveZero(int[] arr){
        int pos =0;//this is the index of the first non zero element
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){//if this index element is not zero just swape with the correct non zero element position
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;//we will increase our postition when ever we get our non-zero element
            }
        }
    }
}
