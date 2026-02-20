package org.example.String;

import java.util.Scanner;

public class StringConvLetToUprCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        StringBuilder res = new StringBuilder("");

        for(int i=0; i<sb.length(); i++){
            if(i==0 || sb.charAt(i-1)==' '){
                res.append(Character.toUpperCase(sb.charAt(i)));
            }
           else  res.append(sb.charAt(i));
        }


        System.out.println(res);
    }
}
