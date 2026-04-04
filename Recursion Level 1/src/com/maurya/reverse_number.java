package com.maurya;

public class reverse_number {
    public static void main(String[] args) {
       reverse(1562);
    }
    static void reverse(int n){
        if(n==0){
            return ;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
}
