import java.util.ArrayList;

public class Power_set {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));


    }
    static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = nums.length;
        int xor = 1 << n;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n - 1; j++) {
                list.add(nums[j]);
            }

            ans.add(list);
        }
        return ans;
    }


}
