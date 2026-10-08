class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];
        return rec(triangle, 0, 0, dp);
    }

    int rec(List<List<Integer>> ls, int i, int j, Integer[][] dp) {
        
        if (i == ls.size() - 1) {
            return ls.get(i).get(j);
        }
        if (dp[i][j] != null)
            return dp[i][j];
        int down1 = ls.get(i).get(j) + rec(ls, i + 1, j, dp);
        int down2 = ls.get(i).get(j) + rec(ls, i + 1, j + 1, dp);
        return dp[i][j] = Math.min(down1, down2);
    }
}