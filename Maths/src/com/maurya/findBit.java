package com.maurya;

public class findBit {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(bit(n));
    }
    static int bit(int n) {
        return (n & (1<<(n-1)));
    }
}
