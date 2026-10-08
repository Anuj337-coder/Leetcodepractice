class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int x=Integer.MAX_VALUE;
        Integer [][] dp =new Integer[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int rec=minsum(matrix, 0, i,dp);
            x=Math.min(rec, x);
        }
        return x;
    }
    int minsum(int[][] matrix, int i, int j,Integer[][] dp){
        
        if(i<0 || j<0 || j>=matrix[0].length || i>=matrix.length)return Integer.MAX_VALUE/2;
        if(i==matrix.length-1)return matrix[i][j];
        if(dp[i][j]!=null)return dp[i][j];
        
        int a= matrix[i][j]+minsum(matrix, i+1, j,dp);
        int b= matrix[i][j]+minsum(matrix, i+1, j-1,dp);
        int c= matrix[i][j]+minsum(matrix, i+1, j+1,dp);
        return  dp[i][j]=Math.min(a,Math.min(b, c));
    }
}