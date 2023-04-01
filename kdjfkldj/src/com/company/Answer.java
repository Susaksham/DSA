package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

    }
    public static String Palindromic_Subsequence(String str){
        ArrayList<String> list  = new ArrayList<>();
        longestPalindrome(str , list);
        Collections.sort(list);
        return (list.size() == 0 ? "-1" : list.get(0));

    }
    public static void longestPalindrome(String s, ArrayList<String> list) {
        String str = "";
        int result = 0;
        /* palandrom can be of length odd and even */
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            while(true){


                if(left < 0 || right== s.length()){
                    if(result < ( right - left - 1 ) ){
                        result = Math.max(result , right - left - 1);
                        str = s.substring(left + 1 , right);

                    }
                    break;

                } else if(s.charAt(left) != s.charAt(right)){
                    if(result < ( right - left - 1 ) ){
                        result = Math.max(result , right - left - 1);
                        str = s.substring(left + 1 , right);


                    }
                    break;
                }
                else if(s.charAt(left) == s.charAt(right)){
                    str = s.substring(left , right+1);
                    list.add(str);
                    right++ ;
                    left--;
                }
            }
        }
        // for even palandrom
        for(int i = 0; i < s.length() - 1; i++){
            int left = i;
            int right = i + 1;
            while(true){
                if(left < 0 || right == s.length()){
                    if(result < ( right - left - 1 ) ){
                        result = Math.max(result , right - left - 1);
                        str = s.substring(left + 1 , right);

                    }
                    break;
                }
                else if(s.charAt(left) != s.charAt(right)){
                    if(result < ( right - left - 1 ) ){
                        result = Math.max(result , right - left - 1);
                        str = s.substring(left + 1 , right);


                    }
                    break;
                }
                else if(s.charAt(left) == s.charAt(right)){
                    str = s.substring(left , right + 1);
                    right++ ;
                    left--;
                }
            }
        }

    }
}
