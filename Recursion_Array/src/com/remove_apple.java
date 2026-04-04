package com;

public class remove_apple {
    public static void main(String[] args) {
        String str = "ijgnapplemkdmd";

        System.out.println(remove( str));
    }
    static String remove( String str) {
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("apple")){
            return remove( str.substring(5));
        }
        return str.charAt(0) + remove(str.substring(1));
    }

}
