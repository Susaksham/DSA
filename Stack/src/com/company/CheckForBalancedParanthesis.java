package com.company;

import java.util.ArrayDeque;

public class CheckForBalancedParanthesis {
    public static void main(String[] args) {


        String str  = "(()))";
        System.out.println(checkBalancedParanthesis(str));

    }
    public static boolean checkBalancedParanthesis( String str){
        ArrayDeque<Character> s  = new ArrayDeque<>();
        String starting = "([{";
        String closing = ")]}";
        for(int i=0; i<str.length();i++){
            if(starting.contains(""+ str.charAt(i))){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                int index = closing.indexOf(str.charAt(i));
                if(s.peek() == starting.charAt(index)){

                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}
