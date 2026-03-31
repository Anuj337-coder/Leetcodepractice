class Solution {
     

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Integer[][] dp = new Integer[n][amount + 1];

        int ans = helper(0, amount, coins, dp);

        return ans >= 1e9 ? -1 : ans;
    }

    private int helper(int i, int amount, int[] coins, Integer[][] dp) {

        if (amount == 0) return 0;
        if (i >= coins.length) return (int)1e9;

        if (dp[i][amount] != null) 
            return dp[i][amount];

        
        int notPick = helper(i + 1, amount, coins, dp);

        
        int pick = (int)1e9;
        if (coins[i] <= amount) {
            pick = 1+helper(i, amount - coins[i], coins, dp);
        }

        dp[i][amount] = Math.min(notPick, pick);
        return dp[i][amount];
    }
}