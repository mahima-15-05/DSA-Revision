package org.example.Recursion;

public class PrintOneToN {

    static int factorial(int n) {

        if (n == 0 || n == 1) return 1;
        int res = n * factorial(n - 1);
        return res;
    }

    static void print(int n) {

        if (n == 0) return;
        System.out.print(n + "  ");
        print(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;
//        print(n);
        System.out.println(factorial(7));
    }
}