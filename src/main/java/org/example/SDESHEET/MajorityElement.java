package org.example.SDESHEET;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        int[] ans = new int[nums.length];
        int count = 0;
        int idx = 0;
        int min_lim =(int) Math.floor((double) nums.length/2);
        for(int i=0; i<nums.length; i++){
            ans[i]++;
        }
    }
}
