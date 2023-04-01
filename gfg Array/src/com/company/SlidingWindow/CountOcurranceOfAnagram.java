package com.company.SlidingWindow;

import java.util.Arrays;

public class CountOcurranceOfAnagram {
    public static void main(String args[]){
        String str = "aabaabaa";
        String pattern ="aaba";
        System.out.println(countOcrrranceOfAnagram(str,pattern));

    }
    public static int countOcrrranceOfAnagram(String str  , String pattern ){
        int i=0;
        int j=0;
        int CHARACTERS = 256;
        int count=0;
        int k = pattern.length();
        int[] string  = new int[CHARACTERS];
        int[] ps = new int[CHARACTERS];
        if(k> str.length()){
            return -1;
        }
        while(j<str.length()){
            if(j-i + 1 < k){
                string[CHARACTERS - str.charAt(j)]++;
                ps[CHARACTERS - pattern.charAt(j)]++;
                j++;
            }
            else if( (i==0) && ((j-i + 1) ==k)  ){
                string[CHARACTERS - str.charAt(j)]++;
                ps[CHARACTERS - pattern.charAt(j)]++;
                if(Arrays.equals(string, ps)){
                    count++;
                }
                j++;
                i++;
            }
            else if((i>0) && ((j-i + 1) == k)){
                string[CHARACTERS - str.charAt(j)]++;
                string[CHARACTERS - str.charAt(i-1)]--;
                if(Arrays.equals(string, ps)){
                    count++;
                }
                j++;
                i++;
            }

        }
        return count;

    }
}
