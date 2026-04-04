package com.maurya;

public class IndexCeiling {

        public static void main(String[] args) {


            int[] arr = {1, 2, 8, 10, 10, 12, 19};
            int target = 9;
            int start= 0;
            int end= arr.length-1;
            int ans = findFloor(arr, target , start,end);
            System.out.println(ans);
        }
        static int findFloor(int[] arr, int target , int start, int end) {
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]>target){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }

            }
            return arr[end];
        }
}

