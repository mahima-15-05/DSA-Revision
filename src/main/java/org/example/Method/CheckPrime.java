package org.example.Method;


import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbet");
        int n = sc.nextInt();
        if(n<0) n=-n;
        if(n==1 || n==0) System.out.println("Non Prime");
        for(int i=2; i<n; i++){
            System.out.println("Not Prime number");
            return;
        }

        System.out.println("Prime number");
    }
}