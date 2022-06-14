class Solution {
    public int minDistance(String word1, String word2) {
        int len = helper(word1, word2);
        return word1.length() + word2.length() - 2 * len;
    }
    
    private int helper(String s1, String s2){
        int dp[][] = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i <= s1.length(); i++){
            for(int j = 0; j <= s2.length(); j++){
                if(i == 0 || j == 0) continue;
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[s1.length()][s2.length()]; 
    }
}