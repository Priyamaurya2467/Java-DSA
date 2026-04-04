package com.maurya;
//Input: nums = [2,4,1,1,6,5]
//Output: 3
//Explanation:
//At index 0: There is no non-equal neighbor of 2 on the left, so index 0 is neither a hill nor a valley.
//At index 1: The closest non-equal neighbors of 4 are 2 and 1. Since 4 > 2 and 4 > 1, index 1 is a hill.
//At index 2: The closest non-equal neighbors of 1 are 4 and 6. Since 1 < 4 and 1 < 6, index 2 is a valley.
//At index 3: The closest non-equal neighbors of 1 are 4 and 6. Since 1 < 4 and 1 < 6, index 3 is a valley, but note that it is part of the same valley as index 2.
//At index 4: The closest non-equal neighbors of 6 are 1 and 5. Since 6 > 1 and 6 > 5, index 4 is a hill.
//At index 5: There is no non-equal neighbor of 5 on the right, so index 5 is neither a hill nor a valley.
//There are 3 hills and valleys so we return 3.
public class leetcode27 {
    public static void main(String[] args) {
        int[] nums = {2,4,1,1,6,5};
        int ans = countHillValley(nums);
        System.out.println(ans);
    }
    static int countHillValley(int[] nums) {
        int countHill=0;
        int countValley=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || i==nums.length-1){
                continue;
            }
            else if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                countHill++;
            } else if (nums[i] <nums[i-1] && nums[i] < nums[i+1]) {
                countValley++;


            }
        }
        return countHill+countValley;
    }
}
