package com.maurya;

import org.w3c.dom.ls.LSOutput;

public class FloorBinaryMethod {
    public static void main(String[] args) {


        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
//greater number smaller or equal than target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
            return -1;

        }
        return arr[end];

    }
}
