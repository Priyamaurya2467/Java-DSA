package com.maurya;

public class charnextGreatestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'd'};
        char target = 'e';
        char ans = search(arr, target);
        System.out.println(ans);
    }

    public static char search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;

            }
        }
        return arr[start % arr.length];
    }
}



