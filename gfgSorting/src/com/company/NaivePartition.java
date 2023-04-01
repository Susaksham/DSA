package com.company;
import java.util.*;
public class NaivePartition {
    public static void main(String[] args) {
        int[] arr ={2,7,8,3,7};
        naviePartition(arr, 4);
        System.out.println(Arrays.toString(arr));
    }
    public static int naivePartition(int[]arr , int l , int h, int p){
        int[] temp = new int[h-l+1] ;
        int index =0;
        for(int i=l;i<=h;i++){
            if(arr[i] < arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i] == arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        int res = l + index -1;
        for(int i=l;i<=h;i++){
            if(arr[i] > arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=l; i<=h;i++){
            arr[i] = temp[i-l];

        }
        return res;
    }
    public static void naviePartition(int[] arr , int index){
        int start =0;
        int end = arr.length-1;
        int element = arr[index];
        int iterator =0;
        int largest = arr[0];
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        largest = largest + 1;
        while(iterator < arr.length){
            if((arr[iterator]%largest) == element){
                count ++;
            }
            if(iterator == index){
                iterator++;
                continue;
            }
            else if(arr[iterator] <element){
                arr[start] = arr[start] + (arr[iterator]%largest)*largest;
                start++;
            }
            else if(arr[iterator] > element){
                arr[end] = arr[end] + (arr[iterator]%largest)*largest;
                end--;
            }
            iterator++;

        }
        for(int j=0;j<arr.length;j++){
            arr[j] = arr[j]/largest;
        }
        while(count >0){
            arr[start] = element;
            start++;
            count--;
        }
    }
}
