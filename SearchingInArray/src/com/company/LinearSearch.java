package com.company;

public class LinearSearch {

    public static void main(String[] args) {
	// write your code here
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int searchElement=4;
        System.out.println(linearSearch(array,searchElement));

    }
    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

}
