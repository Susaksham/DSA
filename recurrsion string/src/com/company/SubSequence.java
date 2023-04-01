package com.company;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        subSequence3("" , "abc" , list);
//        System.out.println(list);
//        System.out.println(subSequence4("" , "abc"));
        subSeqAscii("" ,"abc");
    }
    static void subSequence(String str , String curr, int index ){
        if(index== str.length()){
            System.out.println(curr);
            return;
        }
        subSequence(str, curr ,index+1);
        subSequence(str , curr + str.charAt(index) , index+1);

    }
    static ArrayList<String> subSequence4(String p , String up ){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            System.out.println(p);
            list.add(p);//adding the string in the arraylist
            return list;
        }
        ArrayList<String> left = subSequence4(p , up.substring(1)/*to remove the first character of the string*/ );//when we are not adding the character in the current string
        ArrayList<String> right = subSequence4(p+ up.charAt(0) , up.substring(1) );//when we are adding the character  in the current string
        list.addAll(left );
        list.addAll(right);
        return list;
    }
    static void subSequence3(String p , String up , ArrayList<String> list){
        if(up.isEmpty()){
            System.out.println(p);
            list.add(p);//adding the string in the arraylist
            return;
        }
        subSequence3(p , up.substring(1)/*to remove the first character of the string*/ , list);//when we are not adding the character in the current string
        subSequence3(p+ up.charAt(0) , up.substring(1) , list);//when we are adding the character  in the current string
    }
    static void subSequence2(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSequence2(p , up.substring(1));
        subSequence2(p+ up.charAt(0) , up.substring(1));
    }
    static void subSeqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSeqAscii(p , up.substring(1));
        subSeqAscii(p+ up.charAt(0) , up.substring(1));
        subSequence4(p + (up.charAt(0) + 0) , up.substring(1));
    }
}
