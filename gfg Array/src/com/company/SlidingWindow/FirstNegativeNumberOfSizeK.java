package com.company.SlidingWindow;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstNegativeNumberOfSizeK {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,13,28};
        int k=3;
        System.out.println(firstNegativeNumber(arr,k));

    }
    public static ArrayList<Integer> firstNegativeNumber(int[] arr , int k){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            if((j-i + 1) < k){
                if(arr[j] <0){
                    tempList.add(j);//we are adding all the negative number index in the list
                }
                j++;
            }
            else if((j-i + 1 )==k){//once we reach the window size ,if the last element of the window is
                if(arr[j] < 0){
                    tempList.add(j);
                }
                if(tempList.isEmpty()){
                    list.add(0);
                }
                else if((tempList.get(0) >=i )&& (tempList.get(0) <=j)){

                    list.add(arr[tempList.get(0)]);
                }
                if(tempList.size() >0 && tempList.get(0) == i){
                    tempList.remove(0);
                }
                i++;
                j++;
            }
        }
        return list;

    }
}
