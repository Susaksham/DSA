package com.company;

public class ImprovedNaiveForDistinctPattern {
    public static void main(String[] args) {
        String text = "ABCEABEFABCD";
        String pattern = "ABCD";
        naiveImprovedForDistinctPattern(text , pattern);
        naiveImprovedForDistinctPatternGFG(text , pattern);
    }
    static void naiveImprovedForDistinctPatternGFG( String text , String pattern){
        int n = text.length();
        int m = pattern.length();
        for(int  i= 0; i<=n-m;){
            int j;
            for(j=0; j<m;j++){
                if(pattern.charAt(j) != text.charAt(i + j)){
                    break;
                }
            }
            if(j==m){
                System.out.println(i + " ");
            }
            if(j==0){
                i++;
            }
            else{
                i= i+ j;
            }
        }
    }
    // time complexity of this solution is O(n)
    static  void naiveImprovedForDistinctPattern( String text , String pattern){
        int i=0;
        while(i <= (text.length() - pattern.length())){
            int j=i;
            boolean  flag = true;
            int indexOfPattern = 0;
            while(j < (pattern.length() + i)){
             if(text.charAt(j) != pattern.charAt(indexOfPattern))  {// here we are matching the text and the pattern
                 if(i == j){
                     i++; // when for the first character of the pattern it does not match
                 }
                 else{
                     i = j; // this is when at least first character of the pattern matches
                 }
                 flag = false;
                 break;
             }
             j++;
             indexOfPattern++;
            }
            if(flag){
                System.out.println(i);
                i = i + pattern.length();// when pattern matches completely with text
            }

        }
    }
}
