package com.company;

import java.util.HashMap;

public class FrequencyOFArrayElement {
    public static void main(String[] args) {
        int[] arr = {10,12,10,15,10,20,12,12};
        frequency(arr);
    }
    public static void frequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
//            if(map.containsKey(arr[i])){
//                int value = map.get(arr[i]);
//                map.put(arr[i] , value+1);
//            }
//            else {
//                map.put(arr[i] , 1);
//            }
        }
        System.out.println(map);

    }
}
