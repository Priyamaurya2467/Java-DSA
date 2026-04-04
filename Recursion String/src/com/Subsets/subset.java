package com.Subsets;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        System.out.println(Subset("" , "abc"));



    }
    static ArrayList<String> Subset(String str1 , String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(str1);
            return list;

        }

        char ch = str.charAt(0);
        ArrayList<String> left = Subset(str1 + ch, str.substring(1));
        ArrayList<String> right = Subset(str1, str.substring(1));
        left.addAll(right);
        return left;
    }
}