package org.example.AiPractice;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
