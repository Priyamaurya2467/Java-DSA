package com.maurya;
//directMethod
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 9, 12, 16, 18, 89};
        int target = 10;
            Search(arr, target);

    }

    // return the gratest number >= target
    static void Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target || arr[i] > target) {
                System.out.println(arr[i]);

                break;
            }
        }
    }
}
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
//
//      /