class Solution {
    public int dp[][];
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        dp = new int[n][m];
        for(int i[] : dp) Arrays.fill(i, -1);
        return helper(s, n - 1, t, m - 1);
    }
    public int helper(String s, int i, String t, int j){
        if(j < 0) return 1;
        if(i < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)) return dp[i][j] = helper(s, i - 1, t, j - 1) + helper(s, i - 1, t, j);
        else return dp[i][j] = helper(s, i - 1, t, j);
    }
}