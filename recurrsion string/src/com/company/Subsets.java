package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
    List<List<Integer>> list = subsetDuplicate(arr);
        System.out.println(list);

    }
    static List<List<Integer>>  subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num :arr){
            int n = outer.size();
            for(int i=0; i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>>  subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int index=0; index<arr.length; index++){
            int n = outer.size();
            if(index==0 || arr[index]!=arr[index-1]){
                for(int i=0; i<n;i++){
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(arr[index]);
                    outer.add(internal);
                }
            }

            else{
                for(int i=n/2; i<n;i++){
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(arr[index]);
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
