package org.example.MulDimArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Prog1 {
    public static void main(String[] args) {
        ArrayList<ArrayList> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(7);
        list2.add(8);
        list2.add(9);

        list.add(list1);
        list.add(list2);
        list.add(list2);

        System.out.println(list);

        System.out.println("Printing one by one");
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++){
                System.out.print(list.get(i).get(j)+"  ");
            }
        }
    }
}
