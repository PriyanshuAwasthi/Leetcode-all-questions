class Solution {
    public int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int arr[] : dp) Arrays.fill(arr, - 1);
        return helper(m - 1, n - 1);
    }
    public int helper(int m, int n){
        if(m == 0 || n == 0) return dp[m][n] = 1;
        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = helper(m - 1, n) + helper(m, n - 1);
    }
}