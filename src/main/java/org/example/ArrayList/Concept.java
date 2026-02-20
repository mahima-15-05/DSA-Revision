package org.example.ArrayList;

import java.util.ArrayList;

public class Concept {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> sb = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);


        sb.add("Manya");


        System.out.println(sb);
//        System.out.println(sb.remove(1));

        System.out.println(sb);
        System.out.println("GET: "+sb.get(0));
        System.out.println(sb.contains("Neha"));

    }
}
