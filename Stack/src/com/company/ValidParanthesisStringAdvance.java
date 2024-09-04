package com.company;

public class ValidParanthesisStringAdvance {
    public static void main(String[] args) {
        String str = "(((((()*)(*)*))())())(()())())))((**)))))(()())()";
        System.out.println(checkValidString(str));

    }
    public static boolean checkValidString(String str) {

        int countOfStar = 0;
        int count =0;
        int usedStar = 0;
        // I will take the star as closing bracket
        // If my brackets ever go negative then the star i used i will removed it and increase start count      again

        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '(' ){
                count++;
            } else if(str.charAt(i) == ')'){
                if(count > 0){
                    count--;
                } else{
                    // when count has reached zero
                    if(countOfStar > 0){
                        countOfStar--;
                         usedStar++;
                    } else if(usedStar> 0 ){
                        usedStar--;
                        countOfStar++;
                    }
                    else{
                        return false;
                    }
                }

            } else{
                if(count > 0){
                    // use star as closing bracket
                    count--;
                    usedStar++;

                } else{
                    // when count is zero and start comes
                    // this start can be used as an opening bracket for incomming closing bracket
                    // add this start in  count of the star
                    countOfStar++;

                }
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}
