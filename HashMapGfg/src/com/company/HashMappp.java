package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMappp {
    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> m  = new HashMap<>();

        // Add elements to the map
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Print size and content
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get("courses"));

        // Iterating over HashMap
        for(Map.Entry<String, Integer>e : m.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
    public static void hashing(String[] args)
    {
        // Create an empty hash map
        HashMap<String, Integer> m
                = new HashMap<>();

        // Add elements to the map
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Check for a key
        if (m.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        m.remove("ide");
        System.out.println(m.size());
    }
    public static void hashing2(String[] args)
    {
        // Create an empty hash map
        HashMap<String, Integer> m
                = new HashMap<>();

        // Add elements to the map
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Check for a key
        if (m.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        m.remove("ide");// it also return the corresponding value of the key
        System.out.println(m.size());
    }
}
