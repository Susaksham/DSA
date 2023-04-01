package com.company;

import java.util.ArrayList;

public class LinearSearchOfAllTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5, 5,3,2,6,0};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int target = 3;
        int index=0;
//        System.out.println(findAllIndex(arr,index, target,arrayList).toString());
        System.out.println(findAllIndex2(arr,index, target).toString());
    }
    public static ArrayList<Integer> findAllIndex(int[] arr,int index, int target , ArrayList<Integer> arrayList){
        if(index == arr.length){
            return arrayList;
        }
        //it will contain the ans of that list only
        else if(arr[index] == target){
            arrayList.add(index+1);
        }
        return findAllIndex(arr, index+1,target, arrayList);
    }
    public static ArrayList<Integer> findAllIndex2(int[] arr,int index, int target ){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(index == arr.length){
            return arrayList;
        }



         else if(arr[index] == target){
             arrayList.add(index+1);


        }
        ArrayList<Integer> answerFromBelow= (findAllIndex2(arr, index+1,target));
          answerFromBelow.addAll(arrayList);
          return answerFromBelow;
    }
}
