package com;

public class patternRecursion {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }
    static void pattern(int n){
        if(n==0){
            return;
        }

        for(int i=0;i<n;i++){
            System.out.print("*  " );
        }
        System.out.println();
        pattern(n-1);
    }
}
