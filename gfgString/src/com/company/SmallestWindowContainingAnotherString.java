package com.company;

import java.util.HashMap;

public class SmallestWindowContainingAnotherString {
    public static void main(String[] args) {
        System.out.println(smallestWindow("timetopractice" , "toc"));
    }
    public static String smallestWindow(String s, String p)
    {
//        // Your code here
//        HashMap<Character , Integer> map = new HashMap<>();
//        for(int i=0; i< p.length(); i++){
//            map.put(p.charAt(i) , map.getOrDefault(p.charAt(i) , 0)+ 1);
//        }
//        int right = s.length()-1;
//        HashMap<Character , Integer> map1 = new HashMap<>();
//        for(int i=0; i<s.length();i++){
//            if(map.containsKey(s.charAt(i))){
//                map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i) , 0)+ 1);
//            }
//            if(map1.size() == map.size()){
//                right = i;
//                break;
//            }
//        }
//        int left = 0;
//        for(int i=0; i<s.length(); i++){
//            if(map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i))==1){
//                map1.remove(s.charAt(i));
//                left = i;
//            }
//            else if(map1.containsKey(s.charAt(i))){
//                map1.put(s.charAt(i), map1.get(s.charAt(i)) - 1);
//            }
//
//        }
//        if()
//        return s.substring(left , right + 1);
        return "";
    }
}
