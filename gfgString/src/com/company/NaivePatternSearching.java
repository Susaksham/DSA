package com.company;

public class NaivePatternSearching {
    public static void main(String[] args) {
        String text = "AAAAA";
        String pattern = "AAA";
        naivePatternSearching(text , pattern);
        naivePatternSearching1 ( text , pattern);
    }
    public static void naivePatternSearching1(String text , String pattern){
        int m = pattern.length();
        int n= text.length();
        for(int i=0; i<= n - m; i++){
            int j;
            for(j = 0; j< m;j++){
                if(pattern.charAt(j) != text.charAt(i + j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i);
            }
        }
    }
    public static void  naivePatternSearching(String text , String pattern) {
        int i=0;

        while(i <= ( text.length() - pattern.length())){
            boolean flag = false;
            int j= i;
            int patternIndex = 0;
            while(j < i + pattern.length()){
                if(pattern.charAt(patternIndex) != text.charAt(j)){
                    flag = true;
                    break;
                }
                patternIndex++;
                j++;
            }
            if(!flag){
                System.out.println(i);
            }
            i++;
        }
    }
}
