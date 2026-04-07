package com.maurya;

public class sqroot {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(sq(n));
    }
    static int sq(int n) {
        if(n <=1){
            return 1;
        }
        int c = 2;
        while (c * c <= n){
            if (c*c==n){
                return c;
            }
            c++;
        }
        return 0;
    }
}
