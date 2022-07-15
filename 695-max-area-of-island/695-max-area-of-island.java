class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                int temp = helper(grid, i, j);
                if(area < temp) area = temp;
            }
        }
        return area;
    }
    public int helper(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] <= 0) return 0;
        grid[i][j] = -1;
        int left = helper(grid, i, j - 1);
        int right = helper(grid, i, j + 1);
        int up = helper(grid, i - 1, j);
        int down = helper(grid, i + 1, j);
        
        return 1 + left + right + up + down;
    }
}