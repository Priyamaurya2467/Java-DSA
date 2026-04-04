public class Maximum_sum_subarray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println(maximumSubarray(arr,k));
    }
    public static int maximumSubarray(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = 0 ;
        int sum = 0;
        int max = 0;
        while( j < n){
            sum = sum + arr[j];

            if (j-i+1 < k){
                j++;
            }
            else{
               max = Math.max(max,sum);
               sum = sum-arr[i++];
               j++;
                }
            }
        return max;

        }

}
