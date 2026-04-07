public class longest_subarray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3};
        int k = 7;
        System.out.println(longest(arr,k));
    }
    public static int longest(int[] arr, int k) {
        int l = 0;
        int sum = 0;
        int max = 0;

        for(int r = 0 ; r < arr.length; r++){
            sum = sum + arr[r];
            if (sum > k){
                sum = sum - arr[l];
                l++;

            }
            max = Math.max(max, r - l+1);
        }
        return max;
    }
}
