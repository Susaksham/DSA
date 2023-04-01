package com.company;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
    int[] arr1 = {1, 5, 10, 20, 40, 80};
    int[] arr2 = {6, 7, 20, 80, 100};
    int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(arr1 , arr2 , arr3));
    }
    public static ArrayList<Integer> commonElements(int arr1[], int arr2[], int arr3[])
    {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0;
        int j=0;
        int k=0;
        // // if(a<b && a<c) {
        //     smallest = a;
        // } else if (b<c) {
        //     smallest = b;
        // } else {
        //     smallest = c;
        // }
        while(i<arr1.length && j<arr2.length && k < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                if(list.isEmpty()){
                    list.add(arr1[i]);
                }
                else if((list.get(list.size()-1)) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
                k++;
            }
            else if( (arr1[i] < arr2[j]) && arr1[i] < arr3[k]  ){
                i++;
            }
            else if(arr2[j] < arr3[k]){
                j++;
            }
            else {
                k++;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }
        return list;
    }
}
