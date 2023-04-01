package com.company;

public class PassByReference {
    static int a=0;
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        System.out.println(arr[0]);
        arrChange(arr);
        System.out.println(arr[0]);





    }
    static int[] arrChange(int[] arrayName){
        arrayName[0]=90;

        return arrayName;


    }
}
