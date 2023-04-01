package com.company;

public class LexographicallyRank {
    public static void main(String[] args) {
    String str = "abcd";
        System.out.println(lexographicallyRank(str));
        System.out.println(lexographicallyRankEfficiant(str));}
    public  static int lexographicallyRankEfficiant(String str){
        int rank = 0;
        int fact = factorial(str.length());
        int[] array  = new int[256];
        for(int i=0;  i< str.length();i++){
            array[str.charAt(i)]++;
        }
        for(int i=1; i<256;i++){
            array[i] = array[i] + array[i-1];
        }
        for(int i=0; i< str.length();i++){
            fact =  (fact/(str.length() - i));
           rank = rank +  (array[str.charAt(i)]-1) * fact;
           for(int j=str.charAt(i); j < 256; j++){
               array[j]--;
           }
        }
        return rank + 1;
    }
    public static int lexographicallyRank(String str){
    int[] smallerElements = new int[str.length()];
    for(int i=0;i<str.length();i++){
        int count = 0;
        for(int j=str.length()-1; j>i;j--){
            if(str.charAt(j) < str.charAt(i)){
                count++;
            }
        }
        smallerElements[i] = count;
    }
    int rank = 0;
    for(int i=0; i< str.length();i++){
        rank = rank + smallerElements[i] * factorial(str.length()-1 - i);
    }
    return rank+1; // rank will be smaller string than the given string
    }
    public static int factorial( int n){
        if(n == 1 || n==0){
            return 1;
        }
        return n* (factorial(n-1));
    }
}
// STRING
// GINRST
