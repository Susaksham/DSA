package com.company;

public class SearchInString {
    public static void main(String[] args) {
        String passed="mamyneis saksahm";
        char target='i';
        System.out.println(searchInString(passed,target));
    }
    static int searchInString(String string, char target){
        if(string.length()==0){
            return -1;
        }
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
