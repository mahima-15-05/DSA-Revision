package org.example.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    static int search(int arr[], int key){
        int start=0;
        int end = arr.length-1;
        int mid = start+ (end-start)/2;

        while(start<=end){
            mid = start+ (end-start)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]<key){
                start= mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return-1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array in sorted manner");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        int index = search(arr,key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

    }
}