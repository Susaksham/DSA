package com.company;

import java.util.ArrayList;

public class GraphQuestion {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i= 0; i < 3; i++ ){
            list.add( new ArrayList<>());
        }
        int[][] arr = { {4 , 2},
                {1, 2},
                {2, 3}};;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                list.get(i).add(j , arr[i][j]) ;
            }
        }
        System.out.println(isCycle(5 , list));

    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++){
            if(visited[i] == false){
                System.out.println(" ");
                if(dfs(visited , i , adj , -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(boolean[] visited , int v , ArrayList<ArrayList<Integer>> adj , int previous ){
        visited[v] = true;
        System.out.print( "--> " + v );
        if(v < adj.size()){
            for(int i= 0 ; i < adj.get(v).size(); i++){
                int element = adj.get(v).get(i);
                if(element == v){
                    continue;
                }
                if(element != previous && visited[element] == false){
                    if(dfs(visited , element , adj , v)){
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;

    }
}
