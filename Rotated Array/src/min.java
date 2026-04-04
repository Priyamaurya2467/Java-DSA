import java.util.Arrays;

public class min {
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(getFloorAndCeil(nums, target)));

    }

        static int[] getFloorAndCeil(int[] nums, int x) {
            int start = 0;
            int end = nums.length-1;
            int[] ans = new int[2];
            ans[0] = ceil(nums,x,start,end);
            ans[1] = floor(nums,x,start,end);
            return ans;
        }
        static int floor(int[]nums , int x , int start , int end){
            while(start <= end){
                int mid = start + (end-start)/2;
                if (nums[mid] == x){
                    return mid;
                }
                else if (nums[mid] < x){
                    start = mid + 1;
                }
                else {
                    end = mid-1;
                }
            }
            return nums[start];
        }
        static int ceil(int[]nums , int x , int start , int end){
            while(start <= end){
                int mid = start + (end-start)/2;
                if (nums[mid] == x){
                    return mid;
                }
                else if (nums[mid] < x){
                    start = mid + 1;
                }
                else {
                    end = mid-1;
                }
            }
            return nums[end];
        }
    }

