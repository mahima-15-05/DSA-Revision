package org.example.TwoDim;

public class SearchInSortedMatrix {

    static int findRow(int[][] matrix, int key){
        int row = matrix.length;;
        int col = matrix[0].length;
        int index=-1;
        for(int i=0; i<col; i++){
            if(key==matrix[i][col-1]){
                System.out.println("Index: "+i);
                return 1;
            }
            if(key<matrix[i][col-1])
                index=i;

        }
        return 1;
    }

    static void search(int[][] matrix, int key){

    }


    public static void main(String[] args) {
        int[][] matrix = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9},
                           };

        search(matrix, 4);
    }
}
