class Solution {

    int[] dp;

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        return Math.min(helper(cost, 0), helper(cost, 1));
    }

    public int helper(int[] cost, int i) {

        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int oneStep = helper(cost, i + 1);
        int twoStep = helper(cost, i + 2);

        return dp[i] = cost[i] + Math.min(oneStep, twoStep);
    }
}