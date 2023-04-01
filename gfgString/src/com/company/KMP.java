package com.company;

public class KMP {
    public static void main(String args[]){
        String text = "AAAAA";
        String pattern = "AAA";
        kmp(text , pattern);
    }
    public static void kmp (String text , String pattern){
        int i=0;
        int  j=0;
        int[] lpsArray = lps(pattern);
        while(i < text.length()){
            if(text.charAt(i) == pattern.charAt(j) && j < pattern.length()-1){// when  characters are matching and j < pattern.length()
                i++;
                j++;
            }
            else if(text.charAt(i) == pattern.charAt(j) && j==pattern.length()-1){// when characters are matching and the last character of the pattern also matches
                System.out.println(i - pattern.length() + 1);
                i++;
                j=lpsArray[j];
            }
            else if( text.charAt(i) != pattern.charAt(j) && j > 0){// when the character does not match after some matches
                j = lpsArray[j-1]; // then we  check the longest proper prefix and suffix for the last match charcter in  lps array
            }
            else if( text.charAt(i) != pattern.charAt(j) && j==0){// when the first character of the text does not matches with the  first character of the  pattern
                i++; //
            }
        }
    }
    public static int[] lps (String str){
        int[] lpsArray = new  int[str.length()];
        lpsArray[0] = 0;
        int  len = 0;
        int  i=1;
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(len)){
                len++;

                lpsArray[i] = len;
                i++;
            }
            else if(str.charAt(i) != str.charAt(len) && len ==0){
                lpsArray[i] = 0;
                i++;
            }
            else if(str.charAt(i) != str.charAt(len)){
                len = lpsArray[len-1];
            }
        }
        return  lpsArray;
    }
}
