package org.example.Arrays;
import java.util.Scanner;

public class ReverseArray{
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements by separating them by space");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // before reversing
        for (int j : arr) {
            System.out.print(j + "  ");
        }
        System.out.println();
        reverse(arr);
        //after reversing
        for (int j : arr) {
            System.out.print(j + "  ");
        }

    }
}
