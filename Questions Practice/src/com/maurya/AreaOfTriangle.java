package com.maurya;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        int base = input.nextInt();
        System.out.println("Enter the height of the triangle");
        int height = input.nextInt();
        double area = 0.5 * base * height ;
        System.out.println(area);
    }
}
