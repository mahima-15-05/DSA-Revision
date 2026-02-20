package org.example.String;


public class CompressString {
    public static void main(String[] args) {
        int a;


        StringBuilder sb = new StringBuilder("aaabbcdddyyyy");
        StringBuilder sb2 = new StringBuilder();
        int cnt=1;
        for(int i=1; i<sb.length(); i++){

            if(sb.charAt(i-1)== sb.charAt(i)){
                cnt++;

            }else{
                sb2.append(sb.charAt(i-1));

                if(cnt>1)sb2.append(cnt);
                cnt=1;
            }

        }
        sb2.append(sb.charAt(sb.length()-1));
        if(cnt>1)sb2.append(cnt);
        System.out.println(sb2);
        System.out.println(~5);
    }
}
