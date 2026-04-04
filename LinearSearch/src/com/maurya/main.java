package com.maurya;
public class main {
    public static void main(String[] args) {
        int[] nums = {23,65,78,98,54,21,45,63,1,2,45,87};
        int target = 45;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    //search in the array : return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }



}