package com.maurya;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int ans = sum3(20,20);
        System.out.println(ans);

    }
    //pass the value of a number when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b ;
        return sum;

    }



    //return the value
    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int no1 = sc.nextInt();
        System.out.println("Enter number 2");
        int no2 = sc.nextInt();
        int sum = no1 + no2;
        return sum;

    }
}
