package com.company;

import java.util.ArrayList;
import java.util.*;
public class SortingUsingComparator {
    public int[] frequencySort(int[] arr) {
        HashMap<Integer , Integer> map  = new HashMap<Integer , Integer>();
        for(int i = 0 ; i < arr.length ;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        int[][] aarr = {{1 ,2 } , {3 , 4 } , {4 ,9}};
        Arrays.sort(aarr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(Map.Entry <Integer , Integer> e : map.entrySet()){
            list.add(new ArrayList<Integer>());
            list.get(list.size() - 1).add(e.getKey());
            list.get(list.size() - 1).add(e.getValue());
        }
        Collections.sort(list , new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> ob1 , ArrayList<Integer> ob2){
                if(ob2.get(1) != ob1.get(1)){
                    return ob1.get(1) - ob2.get(1);
                } else{
                    return ob2.get(0) - ob1.get(0);
                }
            }
        } );
        int index = 0;

        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0 ;  j < list.get(i).get(1); j++){

                arr[index] = list.get(i).get(0);
                index++;
            }
        }
        return arr;
    }
}
