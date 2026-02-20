package org.example.Method;

import java.util.Scanner;

public class BinaryToDecimal {
    static int covertBtoD(int n){

        int ans=0;
        int cnt =0;
        while(n>0){

            int temp = n%10;
            if (temp != 0 && temp != 1) {
                System.out.println("Invalid binary number");
                return -1;
            }

            ans = (int) (ans+ temp* Math.pow(2,cnt));
            cnt++;
            n=n/10;

        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number in binary: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println( covertBtoD(n));
    }
}
