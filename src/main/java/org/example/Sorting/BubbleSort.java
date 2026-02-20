package org.example.Sorting;

public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] ={9,8,7,6,5,4,3,2,1};
        int res[]=bubbleSort(arr);

        System.out.print("{ ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+",  ");
        }
        System.out.print(" }");

    }
}
