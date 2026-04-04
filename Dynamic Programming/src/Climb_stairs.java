public class Climb_stairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n==1 || n==0){
            return 1;
        }
        int prev =1;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr+prev;
            prev = temp;
        }
        return curr;

    }
}