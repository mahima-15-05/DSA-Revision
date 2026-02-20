package org.example.Method;

import java.util.Scanner;

public class DecToBin {
    static int convert(int n){
        int ans =0;
        int pw =0;
        while(n>0){
            int ls =n%2;
            ans= (int) (ans+ls*Math.pow(10,pw));
            n=n/2;
            pw++;

        }
        System.out.print("Answer is: "+ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number in decimal: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        convert(n);
    }
}
