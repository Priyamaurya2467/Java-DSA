package com.maurya;

public class wealth {
    public static void main(String[] args) {
        int [][] arr = {
                {2,5,4},
                {3,5,4},
                {4,5,4},
        };
        System.out.println(maximumwealth(arr));


    }
    static int maximumwealth(int[][] arr) {
        /*person=row
        account = col*/
        int max = 0;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
                if (sum > max) {
                    max = sum;
                }

            }
        }
        return max;
    }
}