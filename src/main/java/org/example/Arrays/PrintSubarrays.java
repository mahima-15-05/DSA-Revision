package org.example.Arrays;

import java.util.Scanner;

public class PrintSubarrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; ) {
            if(sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                i++;
            }
            else {
                System.out.print("Enter valid input: ");
                sc.next();
            }
        }


        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("{");
                for(int k=i; k<=j; k++){

                    System.out.print(arr[k]+"  ");
                }
                System.out.print("}");

            }
            System.out.println();
        }


    }
}
