package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubStringWithDistinctCharacter {
    public static void main(String[] args) {
        String str = "abcdabc";
        System.out.println(longestSubstringWithDistinctCharacter(str));
        System.out.println(longestSubstringWithDistinctCharacterEfficiant(str));
        System.out.println(longestSubstringWithDistinctCharacterBruteForce(str));

    }

    public static int longestSubstringWithDistinctCharacterEfficiant( String str){
        int[] array = new int[256];
        Arrays.fill(array , -1);
        int res = 0;
        int currentRes = 0;
        for(int i=0; i < str.length();i++){
            if(array[str.charAt(i)] == -1){
                array[str.charAt(i)] = 1;
                currentRes++;
                res = Math.max(res , currentRes);
            }
            else{
                res = Math.max(res , currentRes);
                currentRes = 0;

            }
        }
        return res;
    }
// brute force solution of O(n^3)
    public static int longestSubstringWithDistinctCharacterBruteForce(String str){
        int res = 0;
        for(int i=0; i< str.length();i++){
            for(int j=i; j< str.length();j++){
           if(areDistinct(str.substring(i , j+1))){
               res  = Math.max(res, j-i + 1);
           }
            }
        }
        return res;
    }
    public static boolean areDistinct( String str){
        boolean[] array = new boolean[256];
        for(int i=0; i< str.length();i++){
            if(array[str.charAt(i)]){
                return false;
            }

            array[str.charAt(i)] = true;
        }
        return true;
    }
    public static int longestSubstringWithDistinctCharacter(String str){
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        int currentRes = 0;
        for(int i=0; i< str.length();i++){
            if(set.contains(str.charAt(i))){
                res = Math.max(res , currentRes);
                currentRes = 0;
            }
            else{
                set.add(str.charAt(i));
                currentRes++;
                res = Math.max(res, currentRes);
            }
        }
        return res;
    }
}
