package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class InterserctionOfTwoUnSortedArray {
    public static void main(String[] args) {
//    int[] arr1 = {10,15,20,5,30};
        int[] arr1 = {10,20};
        int[] arr2 = {20,30};
//    int[] arr2 = {30,5,30,80};
        System.out.println(intersection(arr1,arr2));
        System.out.println(efficient(arr1, arr2));
    }
    public static int  efficient(int[] arr1 , int[] arr2){
        int count = 0;
        HashSet<Integer> set = new HashSet<>(arr1.length);

        for(int i=0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }

        return count;
    }
    public static int  intersection(int[] arr1 , int[] arr2){
        int count = 0;
        HashSet<Integer> set = new HashSet<>(arr1.length);
        HashSet<Integer> set1 = new HashSet<>(arr1.length);
        for(int i=0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i < arr2.length; i++){
            set1.add(arr2[i]);
        }
        Iterator<Integer> iterate = set.iterator();
        while(iterate.hasNext()){
            if(set1.contains(iterate.next())){
                count++;
            }
        }
        return count;
    }
}
