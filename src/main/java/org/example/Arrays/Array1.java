package org.example.Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array separated by spaces: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.print("The updated array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= arr[i]+10;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
