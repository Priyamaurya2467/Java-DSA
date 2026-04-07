package com.maurya;

public class Remove_Duplicates {

    public static void main(String[] args) {
        String str = "jsfnoodakddApplejgnd";
        String str1 = "";
        Duplicate(str1 , str);
        System.out.println(str1);
        System.out.println(Duplicate1(str));
        System.out.println(Duplicate2(str));
    }


    //Recurseively
    static String  Duplicate1( String str) {
        if (str.isEmpty()){
            return "";

        }
        char ch = str.charAt(0);

        if (ch == 'a'){
              return  Duplicate1( str.substring(1));
        }
        else{
            return ch + Duplicate1( str.substring(1));
        }
    }



    //Non - Recursive
    static void  Duplicate( String str1,String str) {
        if(str.isEmpty()){
            System.out.println( str1 );
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            Duplicate(str1 , str.substring(1));
        }
        else {
            Duplicate(str1 + ch , str.substring(1));
        }


    }


    //For Strings
    static String  Duplicate2( String str) {
        if (str.isEmpty()){

            return "";

        }

        if (str.startsWith("Apple")){


            return  Duplicate2( str.substring(5));
        }
        else{
            return str.charAt(0) + Duplicate2(str.substring(1));
        }
    }

}
