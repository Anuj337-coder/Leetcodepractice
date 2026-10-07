class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n-1,nums,dp);

    }
    public int helper(int i,int[]nums,int[]dp){
        int n =nums.length;
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];
         int take= nums[i]+helper(i-2,nums,dp);
        int nottake=helper(i-1,nums,dp);
       
        return dp[i]=Math.max(take,nottake);
    }
}