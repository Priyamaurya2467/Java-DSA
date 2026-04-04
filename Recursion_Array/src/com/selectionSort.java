package com;


import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {15,32,32,41,12,31,11,1};
        System.out.println(Arrays.toString(arr));
    }
    static int[] search(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - i; j++) {

                int max = maximum(arr, 0, arr.length - i);
                swap(arr, max, arr.length - i);

            }
            return search(arr);
        }
        return arr;
    }
    static int maximum(int[] arr, int start, int end){
        int max = arr[start];
        for(int i = start+1; i <= end; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
