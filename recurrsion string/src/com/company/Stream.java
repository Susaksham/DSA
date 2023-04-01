package com.company;

public class Stream {

    public static void main(String[] args) {
	// write your code here
//        skip("","helalo" );
//        System.out.println(skip1("helalo"));
//        System.out.println(skipApple("applemyappleyouareapple"));
        System.out.println(skipAppNotApple("appappleappok"));
    }
    //skipping a character 1st way
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p , up.substring(1));
        }
        else{
        skip(p + ch , up.substring(1));
        }
    }
    //skipping a character second way
    static String skip1( String up){

        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
         return skip1( up.substring(1));
        }
        else{
           String str = ch + skip1(up.substring(1));
           return str;
        }
    }
    //skipping  a string from a another string
    static String skipApple( String up){

        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple( up.substring("apple".length()));
        }
        else{
            char ch = up.charAt(0);
            String str = ch + skipApple(up.substring(1));
            return str;
        }
    }
    //skipping  a app when it is not in apple
    static String skipAppNotApple( String up){

        if(up.isEmpty()){
            return "";
        }

        if((up.startsWith("app")) && (!(up.startsWith("apple")))){
            return skipAppNotApple( up.substring("app".length()));
        }
        else{
            char ch = up.charAt(0);
            String str = ch + skipAppNotApple(up.substring(1));
            return str;
        }
    }
}
