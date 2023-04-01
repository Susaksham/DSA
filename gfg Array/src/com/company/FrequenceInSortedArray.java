package com.company;

public class FrequenceInSortedArray {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        frequenceOfElement(arr);
    }
    public static void frequenceOfElement(int[] arr){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                System.out.println(arr[i-1] +"  : "+count);
                count=1;
            }
            else{
                count++;
            }

        }
        System.out.println(arr[arr.length-1] +" : "+count);
    }
}
