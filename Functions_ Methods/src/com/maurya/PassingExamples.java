package com.maurya;

public class PassingExamples {
    public static void main(String[] args) {
        String name = "Priya Maurya";
        greet(name);
    }
    static void greet(String naam){
        naam = "Pooja Maurya";
        System.out.println("Hello "+ naam +"!");

    }
}
