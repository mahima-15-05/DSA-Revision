package org.example.Method;

import java.util.Scanner;

public class PrimeInRange {

    static boolean checkPrime(int n){
        if(n==1 || n<0)return false;
        if(n==2) return true;

        for(int i=2; i*i<=n; i++){
            if(n%i==0)return false;
        }



        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=2; i<=n; i++){
            if(checkPrime(i))
                System.out.print(i+"  ");
        }

    }
}
