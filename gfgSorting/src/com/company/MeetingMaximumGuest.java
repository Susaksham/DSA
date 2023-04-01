package com.company;

import java.util.Arrays;

public class MeetingMaximumGuest {
    public static void main(String[] args) {
        int[] arrival = {900,600,700};
        int[] dep = {1000, 800,730};
        System.out.println(meetingMaximumGuests(arrival , dep));
    }
    public static int meetingMaximumGuests( int[] array1 , int[] array2 ){
        Arrays.sort(array1);
        Arrays.sort(array2);
        int index1 =0;
        int index2 =0;
        int maxCount = 0;
        int currentCount =0;
        while(index1 < array1.length && index2 < array2.length){
            if(array1[index1] <= array2[index2]){
                currentCount++;
                index1++;
            }
            else{
                maxCount = Math.max(maxCount , currentCount);
                currentCount--;
                index2++;
            }
        }
        return maxCount;
    }
}
