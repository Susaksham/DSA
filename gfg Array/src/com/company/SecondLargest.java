package com.company;

public class SecondLargest {

    public static void main(String[] args) {
	// write your code here
        int[] array ={8,-1,1,2,3,4,5};
        System.out.println(largestElement(array));
    }
    public static int largestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if( (largest > arr[i]) && (arr[i] > secondLargest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
