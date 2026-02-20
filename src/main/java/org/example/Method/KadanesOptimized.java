package org.example.Method;

public class KadanesOptimized {
    public static void main(String[] args) {
        int arr[] = {-2,-3, 4, -7, 17};

        int cs=arr[0];
        int ms= arr[0];

        for(int i=1; i<arr.length; i++){
            cs= Math.max(arr[i], cs+arr[i]);
            ms = Math.max(cs, ms);
        }


        System.out.println("Sum is: "+ms);
    }
}
