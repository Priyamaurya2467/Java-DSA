package com;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2, 34, 1};
        int low = 0;
        int high = arr.length-1;
        quick(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr ,  int low, int high) {
        if (low >= high){
            return ;
        }

        int s = low;
        int e = high;
        int pivot = s+(e-s)/2;
        while (s <= e){
            //also a reason why if its already sorted it will not swap
            while (arr[s] < arr[pivot]){
                s++;
            }
            while (arr[e] > arr[pivot]){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
       //now my pivot is at correct index , please sort two halves now
        quick(arr , low , e);
        quick(arr , s , high);
        }

    }
