package org.example.Collection;

import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(104 , "Mahima");
        map.put(102 , "Riya");
        map.put(103 , "Aman");
        map.put(101 , "Mahima");
        System.out.println(map);
        System.out.println(map.get(103));
        map.remove(102);
        System.out.println(map);

    }
}
