class Solution {
    /*int dp[][];
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
        if(text1.charAt(n - 1) == text2.charAt(m - 1)) return dp[n][m] = 1 + helper(text1, text2, n - 1, m - 1);
        else return dp[n][m] = Math.max(helper(text1, text2, n - 1, m), helper(text1, text2, n, m - 1));
    }*/
    
    /*public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        return helper(text1, text2, n, m);
    }
    public int helper(String text1, String text2, int n, int m){
        if(n == 0 || m == 0) return 0;
        if(text1.charAt(n - 1) == text2.charAt(m - 1)) return 1 + helper(text1, text2, n - 1, m - 1);
        else return Math.max(helper(text1, text2, n - 1, m), helper(text1, text2, n, m - 1));
    }*/
    
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(text1.charAt(i - 1) == text2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else{
                    if(dp[i - 1][j] >= dp[i][j - 1]) dp[i][j] = dp[i - 1][j];
                    else dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[n][m];
    }
}