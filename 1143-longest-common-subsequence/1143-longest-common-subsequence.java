class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        dp = new int[n + 1][m + 1];
        for(int arr[] : dp) Arrays.fill(arr, -1);
        return helper(text1, text2, n, m);
    }
    public int helper(String text1, String text2, int n, int m){
        if(n == 0 || m == 0) return dp[n][m] = 0;
        if(dp[n][m] != -1) return dp[n][m];
        if(text1.charAt(n - 1) == text2.charAt(m - 1)) return dp[n][m] = 1 + helper(text1.substring(0, n - 1), text2.substring(0, m - 1), n - 1, m - 1);
        else return dp[n][m] = Math.max(helper(text1.substring(0, n - 1), text2, n - 1, m), helper(text1, text2.substring(0, m - 1), n, m - 1));
    }
}