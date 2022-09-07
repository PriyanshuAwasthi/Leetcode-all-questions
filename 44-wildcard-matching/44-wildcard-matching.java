/*class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        return helper(p, m - 1, s, n - 1);
    }
    public boolean helper(String p, int i, String s, int j){
        if(i < 0 && j < 0) return true;
        if(i < 0 && j >= 0) return false;
        if(j < 0 && i >= 0){
            for(int a = 0; a <= i; a++) if(p.charAt(a) != '*') return false;
            return true;
        }
        if(s.charAt(j) == p.charAt(i) || p.charAt(i) == '?') return helper(p, i - 1, s, j - 1);
        if(p.charAt(i) == '*') return helper(p, i - 1, s, j) || helper(p, i, s, j - 1);
        return false;
    }
}*/
class Solution {
    public Boolean dp[][];
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        dp = new Boolean[m][n];
        //for(int a[] : dp) Arrays.fill(a, -1);
        return helper(p, m - 1, s, n - 1);
    }
    public boolean helper(String p, int i, String s, int j){
        if(i < 0 && j < 0) return true;
        if(i < 0 && j >= 0) return false;
        if(j < 0 && i >= 0){
            for(int a = 0; a <= i; a++) if(p.charAt(a) != '*') return false;
            return true;
        }
        if(dp[i][j] != null) return dp[i][j];
        if(s.charAt(j) == p.charAt(i) || p.charAt(i) == '?') return dp[i][j] = helper(p, i - 1, s, j - 1);
        if(p.charAt(i) == '*') return dp[i][j] = helper(p, i - 1, s, j) || helper(p, i, s, j - 1);
        return false;
    }
}