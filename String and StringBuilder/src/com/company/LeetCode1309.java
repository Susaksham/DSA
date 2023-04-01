package com.company;

public class LeetCode1309 {
    public static void main(String[] args) {
        String s ="1326#";
        int index = s.length()-1;
        int start = 96;
        StringBuilder st = new StringBuilder("");
        while(index>=0){
            if(s.charAt(index)=='#'){
                String string =(s.charAt(index-2) +"" + s.charAt(index-1));
                int value = Integer.parseInt(string);
                int total = value + start ;
                char character = (char)total;
                st = st.append(Character.toString(character));
                index -=3;
            }
            else{
                int value = Integer.parseInt( Character.toString(s.charAt(index)));
                int total = value + start ;
                char character = (char)total;
                st = st.append(Character.toString(character));

                index--;
            }

        }
        System.out.println(  st.reverse().toString());
    }
    }

