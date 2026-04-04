import java.util.*;

public class Frog_Jump {
    // Solve function using recursion with memoization
    // ind -> current index the frog needs to reach
    // height -> array of heights
    // dp -> memo table where dp[i] stores min cost to reach i
    private static int solve(int ind, int[] height, int[] dp) {
        // If at the first stone, cost is 0
        if (ind == 0) return 0;

        // Return memoized result if already computed
        if (dp[ind] != -1) return dp[ind];

        // Initialize jumpTwo with a large value
        int jumpTwo = Integer.MAX_VALUE;

        // Compute cost when jumping from previous stone (ind - 1)
        int jumpOne = solve(ind - 1, height, dp) + Math.abs(height[ind] - height[ind - 1]);

        // Compute cost when jumping from two stones back (ind - 2) if possible
        if (ind > 1) {
            jumpTwo = solve(ind - 2, height, dp) + Math.abs(height[ind] - height[ind - 2]);
        }

        // Memoize and return the minimum of the two choices
        dp[ind] = Math.min(jumpOne, jumpTwo);
        return dp[ind];
    }

    // Helper to handle edge cases and start recursion
    public static int frogJump(int[] height) {
        // Handle empty input
        if (height == null || height.length == 0) return 0;

        // Prepare dp with -1 indicating uncomputed states
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        // Start from the last index
        return solve(n - 1, height, dp);
    }
}

class Main {
    public static void main(String[] args) {
        // Define the heights array
        int[] height = {30, 10, 60, 10, 60, 50};

        // Create Solution instance


        // Compute and print the minimum energy
        System.out.println(frogJump(height)); // Expected: 40
    }
}
