package com;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 15, 6};
        int target = 5;
        System.out.println(linear(arr,0,target));
    }
    static int linear(int[] arr, int i, int target){
        if(arr[i]==target){
            return i;
        }
        if(i==arr.length){
            return -1;
        }

        return linear(arr,i+1,target);

    }
}
