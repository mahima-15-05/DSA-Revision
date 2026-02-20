package org.example.Arrays;

import java.util.Scanner;

public class MaxSubArraySum {
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

        //sum
        int sum=0;
        int max_sum= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                    sum=0;
                for(int k=i; k<=j; k++){

                    sum+=arr[k];
                }
                max_sum =Math.max(sum, max_sum);


            }
        }

        System.out.println("Sum is: "+max_sum);
    }
}
