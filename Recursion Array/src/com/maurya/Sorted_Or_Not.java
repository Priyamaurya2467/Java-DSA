package com.maurya;

public class Sorted_Or_Not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int j = 0;
        System.out.println(isSorted(arr));
        System.out.println(isSortedRecur(arr , j));

    }
    //normally
    static boolean isSorted(int[] arr){
        if(arr.length==1){
            return true;

        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;
    }
    //recursively
    static boolean isSortedRecur(int[] arr, int j ){
            if (j==arr.length-1){
                return true;
            }
            return  arr[j] < arr[j+1] && isSortedRecur(arr,j+1);

    }
}
