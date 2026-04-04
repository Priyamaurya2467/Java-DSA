package com.maurya;
//Shadowing in Java - A practice of using two variable with the same name having the scope which overlaps
public class Shadowing {
    static int x = 90;  //this will be shadowed at line 8  //available to everything inside
    public static void main(String[] args) {
        System.out.println(x);   //90
        int x;
        x=40;           //the class variable at line 4 is shadowed by this
        System.out.println(x);   //40    //this will be available in this block only
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
