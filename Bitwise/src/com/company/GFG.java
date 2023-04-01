package com.company;


class GFG
{

    static void printPowerSet(String str)
    {
        int n = str.length();

        int powSize = (int)Math.pow(2, n);

        for(int counter = 0; counter < powSize; counter++)
        {
            for(int j = 0; j < n; j++)
            {
                if((counter & (1 << j)) != 0)
                    System.out.print(str.charAt(j));
            }

            System.out.println();
        }
    }
    static void printPowerSet2(String str){
        int n= str.length();//number of character in the string
        int powerSet = (int) Math.pow(2,n);

        for(int counter= 0; counter<powerSet; counter++){
            String str2 ="";
            for(int i=0; i<n;i++){
                //here i will check the set bits
                if((counter & (1<<i) ) !=0){
                   str2 = (str2 + str.charAt(i));

                }
            }
            System.out.println(str2);
        }
    }



    public static void main(String args[])
    {
        String s = "abc";

        printPowerSet2(s);
    }
}