package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,2343,23};
        int search = 0;
        int index=0;
        System.out.println("it will return the position of the element : " + linearSearch(array,0,search));
    }
    public static int linearSearch(int[] arr , int index ,int search){
        if(arr[index]==search){
            return index+1;
        }
        else if(index == arr.length-1){
            return -1;
        }
        return linearSearch(arr, ++index, search);

    }

}
