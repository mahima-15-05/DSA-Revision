package org.example.String;

public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        int x=0; int y=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='W'){
                x=x-1;

            }if(str.charAt(i)=='E'){
                x=x+1;

            }if(str.charAt(i)=='N'){
                y=y+1;

            }if(str.charAt(i)=='S'){
                y=y-1;

            }
        }


        double distance = Math.sqrt(Math.pow(y,2)+ Math.pow(x,2));

        System.out.println(distance);
    }
}
