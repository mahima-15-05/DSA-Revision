package org.example.String;

import java.util.Locale;

public class String1 {
    static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while (i < j) {
            while(i<j && !Character.isLetterOrDigit(str.charAt(i)))i++;
            while(i<j && !Character.isLetterOrDigit(str.charAt(j)))j--;

            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;

            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
//        str=str.toUpperCase();

        System.out.println("Result: " + checkPalindrome(str));

    }
}
