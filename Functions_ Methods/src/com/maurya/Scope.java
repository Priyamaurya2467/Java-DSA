package com.maurya;

public class Scope{
    public static void main(String[] args) {


        int a = 10;
        int b = 20;


        {
            //Block Scope

            // int a = 78; //already initialised outside the block in the same method
            a = 100; // reassign the original ref variable to some other value
          //  System.out.println(a);
            int c = 90;
            // values initialised in the block remain in the block
        }
        System.out.println(a);
    }


}
//static void random(){
//    System.out.println(a);

