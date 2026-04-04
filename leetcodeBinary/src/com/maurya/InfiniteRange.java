package com.maurya;

public class InfiniteRange {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 140;

        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr , int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target>arr[end]) {
            int temp = end + 1;
            //double the box value
            //end = previous end + sizeofbox*2
            end = end + (end-start  ) * 2 ;
            start = temp;
        }
        return search(arr,start,end,target);
    }

    static int search(int[] arr ,int start,int end, int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;

            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
}
