package com.company;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
    int[] arr = {319,212,6,8,100,50};
    radixSort(arr , 5);

        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr , int k){
        //find the largest number from the array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest , arr[i]);   // -------> O(n)
        }
        int digits = (int)Math.log(largest) + 1;

        for(int initialDigits =0; initialDigits < digits ;initialDigits++ ){
            countSort(arr , initialDigits);           // ----------------> O( d * (n + b))  here b is 10
        }

    }
    public static void countSort(int[] arr ,  int  initialDigits){
        int[] count = new int[10];
        int[] output = new int[arr.length];
        for(int index =0;index<arr.length ;index++){
            int countValue  = arr[index]/(int)Math.pow(10,initialDigits);
            int countIndex = countValue%10;
            count[countIndex]++;

        }
        for(int iterator =1;iterator < count.length;iterator++){
            count[iterator] = count[iterator] + count[iterator-1];
        }
        for(int last = arr.length-1 ; last >=0 ; last--){
            int countValue  = arr[last]/(int)Math.pow(10,initialDigits);
            int countIndex = countValue%10;
            output[count[countIndex]-1] = arr[last];
            count[countIndex]--;
        }
        for(int ans =0; ans < output.length;ans++){
            arr[ans] = output[ans];
        }
    }

}
