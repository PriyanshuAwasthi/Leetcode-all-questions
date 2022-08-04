class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1 = "";
        for(int i = 0; i < s.length(); i++) s1 = s.charAt(i) + s1;
        int n = s.length();
        int m = s1.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(s.charAt(i - 1) == s1.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];
    }
}