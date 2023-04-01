package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point implements Comparable<Point>{
    int x, y;
    Point(int x , int y){
        this.x = x ;
        this.y=y;

    }
    public int compareTo(Point p){
        return this.x - p.x;
    }
}
public class SortingCollection {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i).x;
            int y = list.get(i).y;
            System.out.println(x + "," + y);

        }
    }
}
