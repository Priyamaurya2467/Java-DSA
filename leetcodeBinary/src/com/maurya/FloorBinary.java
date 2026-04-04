package com.maurya;

public class FloorBinary {
    public static void main(String[] args) {


        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 8;
        int ans = CeilingBinary(arr, target);
        System.out.println(ans);
    }
    //smallest number greater or equal than target
    static int CeilingBinary(int[] arr, int target) {
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

        }
        return arr[start];

    }
}

