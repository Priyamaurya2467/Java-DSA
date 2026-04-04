package com.maurya;



public class angram {
    public static void main(String[] args) {


        String s1 = "geeks";
        String s2 = "skeeg";
        Boolean ans = search(s1, s2);
        System.out.println(ans);
    }

    static boolean search(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        return n == m;

    }
}
