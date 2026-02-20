package org.example.Method;

import java.util.Scanner;

public class Factorial {
    static long factorial(int n){

        if(n==0 || n==1) return 1;
        if(n<0)return -1;
        long fact=1;
       for(int i=1; i<=n; i++ ){
           fact*=i;
       }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("The factorial is: "+factorial(n));
        System.out.print("Enter the value of n and r: ");
        int n1 = sc.nextInt();
        int r = sc.nextInt();
        long ans=factorial(n1)/(factorial(r)* factorial(n1-r));
        System.out.println(ans);

    }
}
