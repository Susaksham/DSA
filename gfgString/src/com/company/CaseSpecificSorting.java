package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CaseSpecificSorting {
    public static void main(String[] args) {
        System.out.println(caseSort("defRTSersUXI"));
    }
    public static String caseSort(String str)
    {
        // Your code here
        boolean array[] = new boolean[str.length()];
        String res = "";
        ArrayList<Character> smallCharacter = new ArrayList<Character>();
        ArrayList<Character> upperCaseCharacter = new ArrayList<Character>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){

                upperCaseCharacter.add(str.charAt(i)) ;
            }
            else{
                array[i] = true;
                smallCharacter.add(str.charAt(i));
            }
        }
        Collections.sort(smallCharacter);
        Collections.sort(upperCaseCharacter);
        int i=0;
        int j=0;
        for(int k=0; k<str.length() && i < str.length() && j < str.length(); k++){
            if(array[k]){
                res = res + smallCharacter.get(i);
                i++;
            }
            else{
                res = res + upperCaseCharacter.get(j);
                j++;
            }
        }
        return res;
    }
}
