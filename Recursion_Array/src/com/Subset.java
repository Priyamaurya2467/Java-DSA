package com;

import java.util.ArrayList;


public class Subset {
    public static void main(String[] args) {
        String up = "abc";
        String p = " ";
        System.out.println(subsetsArray(p,up));
        subsets(p,up);
        subsetsAscii(p,up);
    }

    static ArrayList<String> subsetsArray(String p , String up ) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subsetsArray(p + ch, up.substring(1 ));
        ArrayList<String> right = subsetsArray(p , up.substring(1));
        left.addAll(right);
        return left;

    }
    static void subsets(String p , String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p, up.substring(1));
        subsets(p + ch, up.substring(1));
    }
    static void subsetsAscii(String p , String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p, up.substring(1));
        subsets(p + (ch+0 ), up.substring(1));
    }

}
