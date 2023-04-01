package com.company;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] array = {15,12,13,12,13,13,18};
        for(int i=0;i< array.length;i++){
            set.add(array[i]);
        }
        System.out.println(set.size());

        System.out.println(naive(array));

    }
    public static int naive(int[] arr){

        int count = 0;
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;

                }
            }
            if(!flag){
                count++;
            }
        }
        return count;
    }

}
