class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for(int arr[] : dp) Arrays.fill(arr, -1);
        return helper(text1, text2, text1.length() - 1, text2.length() - 1);
    }
    public int helper(String text1, String text2, int i, int j){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        else if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + helper(text1, text2, i - 1, j - 1);
            return dp[i][j];
        }
        int a = helper(text1, text2, i - 1, j);
        int b = helper(text1, text2, i, j - 1);
        if(a < b) dp[i][j] = 0 + b;
        else dp[i][j] = 0 + a;
        return dp[i][j];
    }
}