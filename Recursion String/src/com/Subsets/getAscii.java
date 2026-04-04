package com.Subsets;

import java.util.ArrayList;

public class getAscii {

        public static void main(String[] args) {
            System.out.println(SubsetAscii("" , "abc"));
        }
        static ArrayList<String> SubsetAscii(String str1 , String str) {
            if (str.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str1);
                return list;
            }
            char ch = str.charAt(0);
            ArrayList<String> first = SubsetAscii(str1 + ch, str.substring(1));
            ArrayList<String> second = SubsetAscii(str1 , str.substring(1));
            ArrayList<String> third= SubsetAscii(str1 + (ch+0), str.substring(1));
            first.addAll(second);
            first.addAll(third);
            return first;
        }
    }
