class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        return helper(n, dp);
    }
    
    public int helper(int n, int []dp){
        if(n == 0 || n == 1) return n;
        else if(dp[n] != 0) return dp[n];
        else{
            int i = helper(n - 1, dp) + helper(n - 2, dp);
            dp[n] = i;
        }
        return dp[n];
    }
}