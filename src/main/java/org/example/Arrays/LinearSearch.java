package org.example.Arrays;

import java.util.Scanner;

public class LinearSearch {
    static int search(int[] arr, int key) { //formal parameter
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                index=i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array: ");

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int ans = search(arr, key);
        if(ans!=-1)
            System.out.print("The index at which key is present is "+ans); //argument
        else
            System.out.println("Not found");

    }
}
