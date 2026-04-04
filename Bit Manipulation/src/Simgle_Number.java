public class Simgle_Number {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(arr);
    }
    static int singleNumber(int[] nums){
        int ans = 0;
        for (int i = 0; i <= nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
