package com.company;

// Enter your code here. Read input from STDIN. Print output to STDOUT
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = ob.nextInt();
        }
        print(arr);
    }
    public static void print(int[] arr){
        int j=0;
        while(j<arr.length){
            int correctIndex = arr[j] - 1;
            if(arr[correctIndex] != (correctIndex+1)){
                //swap
                int temp = arr[j];
                arr[j] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                j++;
            }
        }
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != (i+1)){
                flag = true;
                System.out.println(arr[i] + " " + (i+1));
            }
        }
        if(flag){
            System.out.println(arr.length + " " + arr.length);

        }


    }


}


