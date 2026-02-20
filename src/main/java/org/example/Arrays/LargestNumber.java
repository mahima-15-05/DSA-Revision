package org.example.Arrays;
import java.util.Scanner;


public class LargestNumber{

    static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]) largest= arr[i];
        }
        return largest;
    }
    public static void main(String[] args){

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements by separating them by space");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findLargest(arr));
    }

}
