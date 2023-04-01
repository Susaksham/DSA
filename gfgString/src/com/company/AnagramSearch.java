package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class AnagramSearch {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String s1 = "rseek";
        anagramSearch(str , s1);
    }
    public  static void anagramSearch( String string , String s1){
        int[] array = new int[256];
        int[] secondArray = new int[256];
        for(int i=0; i< s1.length();i++){
            array[string.charAt(i) + 0]++;
            secondArray[s1.charAt(i) + 0]++;
        }
        for(int j = s1.length();j <= string.length();j++){
            if(Arrays.equals(array, secondArray)){
                System.out.println(j- s1.length());
            }
            if(j < string.length()){
                array[string.charAt(j) + 0]++;
                array[string.charAt(j-s1.length())]--;
            }

        }
    }
}
