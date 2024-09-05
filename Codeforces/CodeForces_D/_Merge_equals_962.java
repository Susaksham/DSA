package CodeForces_D;

import java.util.*;

public class _Merge_equals_962 {
    public static void main(String[] args) {
    int[] arr = {3,4,1,2,2,1,1};
        System.out.println(Arrays.toString(merge(arr , arr.length)));
    }
    public static int[] merge(int[] arr , int n){
        int[] ans = new int[n];

        HashMap<Integer , PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                PriorityQueue<Integer> newPq =   map.get(arr[i]);
                newPq.add(i);
            } else{
                PriorityQueue<Integer> newPq  = new PriorityQueue<>();
                newPq.add(i);
                map.put(arr[i] , newPq);
            }

        }

        for (Map.Entry<Integer,PriorityQueue<Integer>> entry : map.entrySet()){
            PriorityQueue<Integer> newPq =  entry.getValue() ;
            while(newPq.size() > 1){
                int firstIndex = newPq.poll();
                int secondIndex = newPq.poll();
                ans[secondIndex] = 2 * entry.getKey();

                if(map.containsKey(2 * entry.getKey())){
                    PriorityQueue<Integer> newwPq =   map.get(2*entry.getKey());
                    newwPq.add(secondIndex);
                } else{
                    PriorityQueue<Integer> newwPq  = new PriorityQueue<>();
                    newPq.add(secondIndex);
                    map.put(2 * entry.getKey() , newPq);
                }
                ans[firstIndex] = -1;
            }

    }
        return ans;
    }
}
