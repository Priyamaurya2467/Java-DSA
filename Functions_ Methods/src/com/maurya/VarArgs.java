package com.maurya;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,554,6,5,84,56,98);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
