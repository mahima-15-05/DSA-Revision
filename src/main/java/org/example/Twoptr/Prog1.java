package org.example.Twoptr;

import java.lang.Integer;

public class Prog1 {
    public static void main(String[] args){
        int a =10;
        int b=15;

        System.out.println("A== "+a);
        System.out.println("B== "+b);

        a = a^b;
        b =a^b;
        a = a^b;
        System.out.println("Updated");
        System.out.println("A== "+a);
        System.out.println("B== "+b);

    }
}
