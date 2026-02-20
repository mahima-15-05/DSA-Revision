package org.example.Day1;

import java.util.Scanner;

class Answers {
    Scanner sc = new Scanner(System.in);


    void pattern() {
        System.out.println("Enter the number of rows and columns:  ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

    void sum_of_n_nums() {
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        long sum = 0;
        if (n < 0) {
            System.out.println("Entered number is negative");
            return;
        }

//        for(int i=1; i<=n; i++){
//            sum+=i;
//        }

        sum = n * (n + 1) / 2;

        System.out.println("Sum is: " + sum);
    }

    void reverse_num() {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;
        }

        System.out.println("Reversed number: " + reverse);

    }

    void display_except_10() {

        System.out.println("Enter -1 for exit ");
        while (true) {


            System.out.print("Enter a number: ");
            try {
                int n = sc.nextInt();
                if (n == -1) break;
                if (n % 10 == 0) continue;
                else System.out.println(n);
            } catch (Exception e) {
                System.out.println(e);//InputMismatchException
                System.out.println("Invalid input!!, Please enter a number.");
                sc.next();
            }
        }
    }

    void right_triangle_ptrn() {

        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    void inv_triangle_ptrn() {
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

    void num_pyr_ptrn() {
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();


        for (int i = 0; i < num; i++) {
            int count = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count + "  ");
                count++;
            }
            System.out.println();
        }
    }

    void char_pyr_ptrn() {
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        char ch = 'A';

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + "  ");
                ch++;
            }
            System.out.println();
        }
    }

    void hollow_reactangle() {
        System.out.print("Enter number of rows and cols : ");
        int rows = sc.nextInt();//3
        int cols = sc.nextInt();//5

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || i == rows - 1) || (j == 0 || j == cols - 1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();


        }

    }

    void left_pyr_half() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if(j>=rows-i-1) System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();
        }

    }


}

public class PracticeDay1 {
    public static void main(String[] args) {
        Answers ans = new Answers();
//        ans.pattern();
//        ans.sum_of_n_nums();
//        ans.reverse_num();
//        ans.display_except_10();
//        ans.right_triangle_ptrn();
//        ans.inv_triangle_ptrn();
//        ans.num_pyr_ptrn();
//        ans.char_pyr_ptrn();
//        ans.hollow_reactangle();
        ans.left_pyr_half();

    }
}
