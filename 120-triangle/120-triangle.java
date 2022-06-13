class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for(int r[] : dp) Arrays.fill(r, Integer.MAX_VALUE);
        
        return helper(triangle, 0, 0, dp);
    }
    
    private int helper(List<List<Integer>> triangle, int r, int c, int[][] dp){
        if(r == triangle.size()) return 0;
        else if(dp[r][c] != Integer.MAX_VALUE) return dp[r][c];
        else{
            int min = 0;
            int a = helper(triangle, r + 1, c, dp);
            int b = helper(triangle, r + 1, c + 1, dp);
            if(a < b) min = a;
            else min = b;
            
            dp[r][c] = triangle.get(r).get(c) + min;
        }
        return dp[r][c];
    }
}