class Solution {
    public int n;
    public int m;
    public int getMaximumGold(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int ans = 0;
        for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) if(grid[i][j] > 0) ans = Math.max(ans, helper(grid, i, j));
        return ans;
    }
    public int helper(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) return 0;
        int t = grid[i][j];
        grid[i][j] = 0;
        int down = helper(grid, i + 1, j);
        int up = helper(grid, i - 1, j);
        int left = helper(grid, i, j - 1);
        int right = helper(grid, i, j + 1);
        grid[i][j] = t;
        return t + Math.max(Math.max(left, right), Math.max(up, down));
    }
}