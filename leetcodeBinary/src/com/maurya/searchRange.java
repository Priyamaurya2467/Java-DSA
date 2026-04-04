//package com.maurya;
//
//import java.util.Arrays;
//
//public class searchRange {
//    public static void main(String[] args) {
//        int[] arr = { 5 , 7 , 7 , 8 , 8, 10};
//        int target = 8;
//        int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));
//
//    }
//    static int[] search(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length - 1;
//        if(target > nums[end]){
//            return new int[]{-1,-1};
//        }
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (nums[mid] == target) {
//
//                    return new int[]{mid};dddddd
//
//            }
//            else if (nums[mid] > target) {
//                end = mid - 1;
//            }
//            else {
//                start = mid+1;
//            }
//
//        }
//        return new int[]{start, end};
//    }
//}
