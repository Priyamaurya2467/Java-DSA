package com;

public class Remove_a {
    public static void main(String[] args) {
        String str = "baccad";
        String str1 = " ";
        System.out.println(check(str1,str));
    }
    static String check(String str1,String str) {
        if (str.isEmpty()) {
            return str1;
        }
        char ch = str.charAt(0);
        if (ch != 'a') {
            return check(str1+ch, str.substring(1));
        }

            return check(str1, str.substring(1));

    }


}
