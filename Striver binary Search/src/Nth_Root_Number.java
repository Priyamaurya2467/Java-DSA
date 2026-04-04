public class Nth_Root_Number {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(NthRoot(n,m));
    }
    public static int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(NthRoot(mid,n) == m) {
                return mid;
            }
            else if(NthRoot( mid , n) < m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
