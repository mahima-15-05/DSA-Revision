package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;


public class ReverseArrayList {
    static void reverse(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            int temp = list.get(i);

        }
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the list elements ( Enter q to quit)");
//        while(true){
//            if(sc.hasNextInt())
//                list.add(sc.nextInt());
//            else {
//                String s = sc.next();
//                if(s.equalsIgnoreCase("q"))break;
//                else System.out.println("Invalid input! Please enter an integer or 'q' to quit.");
//            }
//        }
//
//        System.out.println(list);
//
//        reverse(list);

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        while(true){
            if(sc.hasNextInt()){
                list.add(sc.nextInt());
            }
            else{
                String s = sc.next();

                if(s.equalsIgnoreCase("q")){
                    break;
                }
                else{
                    System.out.println("Invalid input! (Enter q to exit)");
                }
            }
        }

        System.out.println(list);


        for(int i=0; i<list.size()/2; i++){
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp );
        }
        System.out.println(list);

    }
}
