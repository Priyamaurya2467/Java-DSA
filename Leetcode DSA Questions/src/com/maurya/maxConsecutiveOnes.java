package com.maurya;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int p = 0;
        int r = 0;
        int max = 0;
        while(r <  nums.length){
            while(r <= nums.length-1 && nums[r] == 1 ){
                r++;
            }
            max = Math.max(max, r-p);
            p++;
            r=p;
        }
        return max;
    }
}
