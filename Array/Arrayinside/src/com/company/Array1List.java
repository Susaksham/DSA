package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1List {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(31);
        list.add(32);
        list.add(8);
        list.add(0);
        list.add(334);
        list.add(323);
        list.add(36);
        System.out.println(list);


        ArrayList<ArrayList<Integer>> list2= new ArrayList<>();

        //creating a internal Arraylist so that we can get that list ,,,,here we are not specifying the size of the row that we do in
        //2D array
        for(int i=0;i<3;i++){
            list2.add(new ArrayList<>());
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                list2.get(i).add(in.nextInt());
            }
        }









    }
}
