package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckForAnagram {
    public static void main(String[] args) {
        String s1 = new String("listen");
        String s2 = new String("silent");
        System.out.println(anagram(s1 , s2));;
        System.out.println(anagram2(s1 , s2));
        System.out.println(mostEfficiantSolution(s1 , s2));
    }

    public  static boolean mostEfficiantSolution(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] temp = new int[256];
        for(int i=0; i<s1.length();i++){
            temp[s1.charAt(i)]++;
            temp[s2.charAt(i)]--;

        }
        for(int i=0;i < temp.length;i++){
            if(temp[i] !=0){
                return false;
            }
        }
        return true;
    }
    public static boolean anagram2 (String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character , Integer > map = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        for(int i=0; i<s1.length();i++){
            map.put(s1.charAt(i) , map.getOrDefault(s1.charAt(i) , 0) + 1);
            map2.put(s2.charAt(i) , map2.getOrDefault(s2.charAt(i) , 0) + 1);

        }
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            if(map2.containsKey(entry.getKey())){
                if(!(map2.get(entry.getKey()) == entry.getValue())){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static boolean anagram( String s1 , String s2 ){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        s1 = new String(array1);
        s2 = new String(array2);
        if(s1.equals(s2)){
            return true;
        }
        return false;

    }
}
