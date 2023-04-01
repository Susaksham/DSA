package com.company;

public class IntersectionOfSortedArray {
    public static void main(String[] args){
    int[] arr1 = {3,5,8};
    int[] arr2 = {2,8,9,10,15};
    intersectionOfSortedArray(arr1 , arr2);
    }
    public static void intersectionOfSortedArray(int[] arr1 , int[] arr2){
        int i=0;
        int j=0;
        while( i < arr1.length && j < arr2.length){
            if( i>0 && arr1[i] == arr1[i-1]){
                i++;
            }
            else if(j>0 && arr2[j] == arr2[j-1]){
                j++;
            }
            else if(arr1[i] <arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while( i < arr1.length){
            if(i>0  &&  arr1[i] != arr1[i-1] ){
                System.out.print(arr1[i]  + " ");
            }
            i++;
        }
        while( j < arr2.length){
            if(j>0 && arr2[j] != arr2[j-1]){
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }
}
