public class SQRT_OF_NUMBER {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(sqrt(n));
    }
    public static int sqrt(int n){
        int low = 1;
        int high = n;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (mid * mid == n){
                return mid;
            }
            else if (mid * mid < n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
