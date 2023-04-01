package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = new int[] {20,88,10,85,75,95,18,82,60};
        int k= 5;
        bucketSort(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void bucketSort(int[] arr , int k){
        int n= arr.length;
        int max_val = arr[0];
        for(int i=0;i<arr.length;i++){
            max_val = Math.max(max_val , arr[i]);
        }
        max_val++;// for the case when the largest element will be equal to an element
        ArrayList<ArrayList<Integer>> outerBucket = new ArrayList<ArrayList<Integer>>();
        for(int j=0;j<k;j++){
            outerBucket.add(new ArrayList<Integer>());
        }
        for(int index =0 ; index <arr.length;index++){
             int bi =(arr[index]*k)/max_val;// very important formula
             outerBucket.get(bi).add(arr[index]);
        }
        for(int iterator =0; iterator < outerBucket.size();iterator++){
            Collections.sort(outerBucket.get(iterator));// here we are using the insertion sort because it is used for the small array

        }
        int g=0;
        for(int i=0;i<outerBucket.size();i++){
            for(int j=0; j<outerBucket.get(i).size();j++){
                arr[g] = outerBucket.get(i).get(j);
                g++;
            }
        }

    }
}
