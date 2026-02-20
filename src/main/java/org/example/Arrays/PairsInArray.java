package org.example.Arrays;

import java.util.Scanner;

public class PairsInArray {
    public static void main(String[] args) {
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("( "+arr[i]+", "+ arr[j]+" )");
                cnt++;
            }
            System.out.println();
        }

        System.out.println("Number of pairs is: "+cnt);
    }
}
