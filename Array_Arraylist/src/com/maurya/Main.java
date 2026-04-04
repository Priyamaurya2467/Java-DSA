package com.maurya;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
        String[] str = new String[5];
        for (int i = 0; i < 5; i++) {
            str[i] = in.next();
        }
            System.out.println(Arrays.toString(str));
        //modify
        str[2] = "fdhhd";


//        //array of objects loop using str[i]
//        String[] str = new String[5];
//        for (int i = 0; i < 5; i++) {
//            str[i] = in.next();
//        }
//        for (int i = 0; i < 5; i++) {
//
//            System.out.print(str[i] + "  ");
//        }
        }
    }

