package com;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutations(" ", "abc");

    }
    static void permutations(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String p1 = p.substring(0, i);
            String p2 = p.substring(i);
            permutations(p1+ch+p2 , up.substring(1));
        }
    }

    static ArrayList<Integer> permutationsArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String p1 = p.substring(0, i);
            String p2 = p.substring(i);
            list.addAll(permutations(p1+ch+p2 , up.substring(1)));
            return list;
        }
    }

}
