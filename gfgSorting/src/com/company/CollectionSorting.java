package com.company;

import java.util.*;

public class CollectionSorting {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add( new ArrayList<>());
        }
        for( int i = 0; i < list.size(); i++){
            list.get(i).add((int)Math.floor(Math.random() * 15));
            list.get(i).add((int)Math.floor(Math.random() * 15));
        }
        System.out.println(list);
        Collections.sort(list , new Comparator<ArrayList<Integer>>(){

            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.get(1).compareTo(o1.get(1));
            }
        });
        System.out.println(list);
        int[][] arr = {{ 6 , 10} , {8 , 2} , {11 , 14} , {11 , 8} , {11 , 7}};
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for(int i = 0; i < arr.length ; i++){
            System.out.print('[');
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println(']');
        }

    }
}

