class Solution {

    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        return helper(n);
    }

    public int helper(int n) {

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int step1 = helper(n - 1);
        int step2 = helper(n - 2);

        return dp[n] = step1 + step2;
    }
}