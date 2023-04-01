package com.company;

public class CheckStringSubSequence {
    public static void main(String[] args) {
        System.out.println(subsequenceCheck("ABCDE" , "AED"));;
        System.out.println(subSequenceTest("ABCDE" , "ACD" , "" , 0));
        System.out.println(subSequenceCheckUp("ABCDE" , "AED" , 4 , 2));
    }
    public static boolean subsequenceCheck(String str , String check){
        int i=0;
        int j=0;
        while((i<str.length()) && (j < check.length())){
            if(str.charAt(i) == check.charAt(j)){
                i++;
                j++;
                continue;
            }
            i++;
        }
        if(j==check.length()){
            return true;
        }
        return false;

    }
    public static boolean subSequenceCheckUp(String str , String check , int n , int m){
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(str.charAt(n) == check.charAt(m)){
            return subSequenceCheckUp(str , check , n-1 , m-1);
        }
        else{
            return subSequenceCheckUp(str , check , n-1 , m);
        }
    }
    public static boolean subSequenceTest ( String str , String check , String result , int index){
        if(index == str.length()){
            if(check.equals(result)){
                return true;
            }
            return false;
        }
        boolean ans1 = subSequenceTest(str , check , result + str.charAt(index) , index + 1);
        boolean ans2 = subSequenceTest(str , check , result , index + 1);
        return  ans1 | ans2 ;
    }
}
