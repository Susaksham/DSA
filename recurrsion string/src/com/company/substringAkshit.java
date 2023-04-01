package com.company;

public class substringAkshit {
    public static void main(String[] args) {
        subSequence2("ABC","",0);
    }
    static void subSequence(String str , String curr, int index ){
        if(index== str.length()){
           if(helperFunction(curr)){
               System.out.println(curr);
           }

            return;
        }
        subSequence(str, curr ,index+1);
        subSequence(str , curr + str.charAt(index) , index+1);

    }
    static boolean helperFunction(String string){
        if(string.isEmpty()){
            return true;
        }
        if(string.charAt(0) == string.charAt(string.length()-1) ){
            return true;
        }
        return false;
    }
    static void subSequence2(String str , String curr , int index){
        if(index == str.length()){
            System.out.println(curr);
            return;
        }
        subSequence2(str , curr , index + 1);
        curr = curr + str.charAt(index);
        subSequence2(str , curr , index + 1);
    }
}
