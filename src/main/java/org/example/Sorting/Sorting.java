package org.example.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    static void bubblesort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

            if (!swapped) break;
        }


    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int midIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[midIndex] > arr[j]) {
                    midIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1]=current;
        }
    }


    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 10};
//        Integer arr[] = {8, 7, 6, 5, 4, 3, 2, 10};
        System.out.println("Before Sorting -->");
        printArray(arr);
//        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("After Sorting -->");
        printArray(arr);


    }
}


/*  Counting sort
static void countingSort(int[] arr) {
    if (arr.length == 0) return;

    // 1️⃣ Find maximum value
    int max = arr[0];
    for (int num : arr) {
        if (num > max) {
            max = num;
        }
    }

    // 2️⃣ Create count array
    int[] count = new int[max + 1];

    // 3️⃣ Store frequency
    for (int num : arr) {
        count[num]++;
    }

    // 4️⃣ Rebuild original array
    int index = 0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            arr[index] = i;
            index++;
            count[i]--;
        }
    }
}

*
* */