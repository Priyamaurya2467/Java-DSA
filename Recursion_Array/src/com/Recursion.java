package com;

public class Recursion {
    public static void main(String[] args) {
        //Sort Array
        int[] arr = {1, 2, 4, 15, 6};
        int i = 0;
        System.out.println(Sorted(arr,i));
    }
    static Boolean Sorted(int[] arr , int i) {

        if (i==arr.length-1) {
            return true;
        }


    return arr[i]<arr[i+1]&&Sorted(arr,i+1);
    }
}