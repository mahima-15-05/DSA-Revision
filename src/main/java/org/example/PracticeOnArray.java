package org.example;

//Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
//Output: 5
//Explanation: 4th smallest element in the given array is 5.

public class PracticeOnArray {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2};

        int k = 5;

        int indx = -1;
        int smallest = Integer.MAX_VALUE;

        for (int j = 0; j < k; j++) {
            smallest=Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                    indx = i;
                }
            }
            arr[indx] = Integer.MAX_VALUE;

        }
        System.out.println("Value is: " + smallest);
    }
}
