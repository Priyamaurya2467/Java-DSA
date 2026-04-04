package com.maurya;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {54,32,87,551,65,62};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k++] = left[i++];
            }
            else {
                ans[k++] = right[j++];
            }
        }
        //it may be possible that one of the arrays is not complete
        //copy the remaining element
        while (i < left.length) {
            ans[k++] = left[i++];
        }
        while (j < right.length) {
            ans[k++] = right[j++];

        }
        return ans;
    }
}
