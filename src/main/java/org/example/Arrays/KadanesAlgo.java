package org.example.Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr={-3,5,-4,14,-2};
        int cs=0;
        int max_sum = Integer.MIN_VALUE;

            for(int j=0; j<arr.length; j++){
                cs+=arr[j];
                if(cs<0){
                    cs=0;
                }
                max_sum = Math.max(max_sum, cs);
            }
        System.out.println("Sum is: "+max_sum);
    }
}

//<-----------------Handles all the scenarios-------------->

//package org.example.Arrays;
//
//public class KadanesAlgo {
//    public static void main(String[] args) {
//        int[] arr = {-3, 5, -4, 14, -2};
//
//        int cs = arr[0];
//        int max_sum = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            cs = Math.max(arr[i], cs + arr[i]);
//            max_sum = Math.max(max_sum, cs);
//        }
//
//        System.out.println("Sum is: " + max_sum);
//    }
//}







