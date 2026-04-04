package com;

import java.util.ArrayList;


public class MultipleSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 15, 6,2,8,2,9,2};

        int target = 2;
        System.out.println(linear(arr,0,target));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> linear(int[] arr, int i, int target){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);

        }
        return linear(arr,i+1,target);
    }
}
