package com.company;

import java.util.Arrays;

public class ReverseAWord {
    public static void main(String[] args) {
//        String str = "Welcome to gfg";
        String str = "a welcome to geeksforgeeks  b";
        char[] characterArray = str.toCharArray();
        inPlaceReversingSentence(characterArray);
        str = String.valueOf(characterArray);
        System.out.println(str);

    }
    static void  inPlaceReversingSentence1( char[]  str){
        int start = 0;
        int end = 0;
        for(end = 0 ; end  < str.length;end++){
            if(str[end] == ' '){
                reverse(str  , start , end - 1 );
                start = end  + 1;
            }
        }
        reverse(str , start , end -1);
        reverse(str , 0 , str.length -1);


    }
    //for the single space and multiple space
    static void  inPlaceReversingSentence( char[]  str){
        int start = 0;
        int end = 0;
        for(end = 0 ; end  < str.length;end++){
            if(str[end] == ' '){
                reverse(str  , start , end - 1 );
                start = end  + 1;
            }
        }
        reverse(str , start , end -1);
        reverse(str , 0 , str.length -1);


    }
    static void reverse( char[] array , int start , int end){
        while(start < end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public  static String reverseSentence( String str){
        String[] array = str.split(" ");
        reverseArray(array);
       String tempString = String.join( " " , array);

        return tempString;
    }
    static  void reverseArray( String[] array){
        int start = 0;
        int end = array.length-1;
        while(start < end){
            String temp = array[start];
            array[start] = array[end];
            array[end]= temp;
            start++;
            end--;
        }
    }

}
