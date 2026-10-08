class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]dp=new int[n][m];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        if(grid[n-1][m-1]==1)return 0;
        
        return helper(n,m,0,0,grid,dp);
        
    }
    public int helper(int n ,int m,int i,int j,int [][]grid,int[][]dp){
        if(i>=n || j>=m)return 0;
        if(i==n-1 && j==m-1)return 1;
        if(grid[i][j]==1)return 0;
  
        if(dp[i][j]!=-1)return dp[i][j];
        int right=helper(n,m,i,j+1,grid,dp);
        int left=helper(n,m,i+1,j,grid,dp);
        return dp[i][j]=right+left;
    }
}