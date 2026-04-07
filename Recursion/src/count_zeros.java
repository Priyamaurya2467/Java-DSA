package com.maurya;

public class count_zeros {
    public static void main(String[] args) {
        System.out.println(count(13210351));
    }
    static int count(int n){
        int counting=0;
        if(n==0){
            return 1;
        }
        int a = n%10;
        if(a==0){
            counting++;
        }
        return  count(a);

    }
}
