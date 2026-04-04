package com.maurya;

import java.util.ArrayList;

public class finding_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5,32,5, 24, 5};
        int target = 5;
        int j = 0;
        //System.out.println(search(arr, j , target));
        System.out.println(searchIndex(arr , j , target));
//        searchIndexAll(arr , j , target);
//        System.out.println(list);
    }
    static boolean search(int[] arr, int j , int target) {
        if (j==arr.length){
            return false;
        }
        return arr[j] == target ||  search(arr, j+1, target);
    }
    static int searchIndex(int[] arr , int j , int target) {
        if (j==arr.length){
            return -1;
        }
        else if(arr[j]==target){
            return j;
        }
        else{
            return searchIndex(arr, j+1, target);
        }
    }

    static ArrayList<Integer> searchIndexAll(int[] arr , int j , int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (j==arr.length){
            return list;
        }
        if(arr[j]==target){
            list.add(j);
        }

           return searchIndexAll(arr, j+1, target);


    }

}

