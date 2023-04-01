package com.company;

public class Leetcode1859 {
    public static void main(String[] args) {
        String s= "is2 sentence4 This1 a3";
        String[] array=s.split(" ");
        String[] array2= new String[array.length];
        for(int i=0;i<array.length;i++){
            StringBuilder string=new StringBuilder(array[i]);
            int index=Integer.parseInt(String.valueOf(string.charAt(string.length()-1)));
            array2[index-1]=string.deleteCharAt(string.length()-1).toString();


        }
        System.out.println(String.valueOf(array2));
    }
}
