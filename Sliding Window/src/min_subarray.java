public class min_subarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int k  = 7 ;
        System.out.println(minimum(arr,k));
    }
    public static int minimum(int[] arr, int k) {
        int i = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for( int r  = 0 ; r < arr.length; r++ ){
            sum += arr[r];
            while (sum >= k){
                minLen = Math.min(minLen, r - i+1);
                sum = sum - arr[i];
                i++;
            }
        }
        return minLen;
    }
}
