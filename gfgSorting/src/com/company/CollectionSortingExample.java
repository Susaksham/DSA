package com.company;

import java.util.*;

public class CollectionSortingExample {
    public static void main(String[] args){
        int[] arr = {-3 , 2 , 4 , 8 , -9 , -10 , 20 , 0};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
    public static int[] frequencySort(int[] arr) {
        HashMap<Integer , Integer> map  = new HashMap<Integer , Integer>();
        for(int i = 0 ; i < arr.length ;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(Map.Entry <Integer , Integer> e : map.entrySet()){
            list.add(new ArrayList<Integer>());
            list.get(list.size() - 1).add(e.getKey());
            list.get(list.size() - 1).add(e.getValue());
        }
        Collections.sort(list , new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> ob1 , ArrayList<Integer> ob2){
//                if(ob2.get(1) != ob1.get(1)){
//                    return ob1.get(1) - ob2.get(1);
//                } else{
                    return ob2.get(0) - ob1.get(0);
//                }
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
