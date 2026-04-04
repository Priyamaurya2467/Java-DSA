import java.util.Arrays;

public class Sort_aaray {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {

            int low = 0;
            int mid = 0;
            int high = nums.length-1;
            while(mid <= high){
                if (nums[mid] == 0){
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                }
                else if (nums[mid] == 1){
                    mid++;
                }
                else{
                    int temp1 = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp1;
                    high--;
                }

            }

            System.out.println(Arrays.toString(nums));
        }
    }
