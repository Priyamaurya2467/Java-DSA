package com.maurya;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double area = 3.14 * n * n;
        System.out.println(area);
    }
}
