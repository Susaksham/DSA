package com.company;

public class Permutation {
    public static void main(String[] args) {
    permutation("abc" , 0);
    }
    public static void permutation(String str , int index ){
        if(index==str.length()-1){
            System.out.println(str);
        }
        for (int j=index ;j<str.length();j++){
            char[] array = str.toCharArray();
            char temp = array[index];
            array[index] = array[j];
            array[j] = temp;
            str = array.toString();

            permutation(str,index+1);
            char[] array1 = str.toCharArray();
            char temp1 = array1[index];
            array1[index] = array1[j];
            array1[j] = temp1;
            str = array1.toString();

        }
    }
    public static void swap(String str, int first , int second){


    }
}
