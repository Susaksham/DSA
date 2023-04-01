package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class UnionOfTwoUnSortedArray {
    public static void main(String[] args) {
    int[] arr1 = {15,20,5,15};
    int[] arr2 = {15,15,15,20,10};
        System.out.println(union(arr1, arr2));
        System.out.println(efficient(arr1, arr2));
    }
    public static int efficient(int[] arr1, int[] arr2){
        int count =0;
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!(set1.contains(arr2[i]))){
                set1.add(arr2[i]);
            }
        }
        return set1.size();
    }
    public static int union(int[] arr1 , int[] arr2){
        int count =0;
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set2.add(arr2[i]);
        }
        Iterator<Integer> iterate = set1.iterator();
        while(iterate.hasNext()){
            int value = iterate.next();
            if(set2.contains(value)){

                set2.remove(value);
            }
        }
        return set1.size() + set2.size();
    }
}
