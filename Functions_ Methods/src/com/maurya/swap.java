package com.maurya;
public class swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swaping(a,b);
        String name = "Priya";
        changeName(name);

    }
    static void swaping(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print(a + " " +b);
    }
    static void changeName(String name){
        name = "Maurya";
        System.out.println("Hello "+name+"!");

    }
}