package com.company;

import java.util.ArrayList;

public class primemedium {
    public static void main(String[] args) {

        int count=0;
        int n=10;
       ArrayList<Integer> ref=new ArrayList();
        for(int i=2;i<n;i++){
            boolean prime=true;
            for(int j=2;j<i;j++){
                if((i%j==0)){
                    prime=false;
                    break;
                }

            }
            if(prime==true){
                count++;
            }

        }
        System.out.println(count);

    }
}
