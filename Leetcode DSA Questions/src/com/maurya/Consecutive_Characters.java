package com.maurya;

public class Consecutive_Characters {
    public static void main(String[] args) {
        String s  = "leetcode";
        System.out.println(maxPower(s));
    }
    static int maxPower(String s){
        int max = 0;
        int n = s.length();
        int left = 0;
        int right = 1;
        while(right<n){
            if(s.charAt(right)==s.charAt(left)){
                right++;
            }
            else{
                if( s.charAt(right) !=s.charAt(left)){
                    max = Math.max(max,right-left+1);
                    left++;
                    right++;

                }
            }
        }
        return max-1;
    }
}
