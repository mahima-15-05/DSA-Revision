package org.example.ArrayList;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class MaxInArrayList {
    static int findMax(ArrayList<Integer> list){
        int max = -1;

        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max)max=i;
        }

       return max;
    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(94);
        list.add(2);

        System.out.println(list);
        System.out.println(list.get(findMax(list)));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
