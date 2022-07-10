class Solution {
    public int global_min = 1000001;
    public int [][][]dp;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new int[m][target + 1][n + 1];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < target + 1; j++){
                for(int k = 0; k < n + 1; k++) dp[i][j][k] = -1;
            }
        }
        int ans = helper(houses, cost, m, n, target, 0, 0, 0);
        return (ans < global_min) ? ans : -1;
    }
    
    public int helper(int[] houses, int[][] cost, int m, int n, int target, int starting, int curr_nbr, int left_col){
        if(starting == m) return (curr_nbr == target) ? 0 : global_min;
        
        if(curr_nbr > target) return global_min;
        
        if(dp[starting][curr_nbr][left_col] != -1) return dp[starting][curr_nbr][left_col];
        
        if(houses[starting] == 0){
            int min_cost = global_min;
            for(int c = 1; c <= n; c++){
                int new_nbr = curr_nbr;
                if(left_col != c) new_nbr++;
                int temp = cost[starting][c - 1] + helper(houses, cost, m, n, target, starting + 1, new_nbr, c);
                if(min_cost > temp) min_cost = temp;
            }
            dp[starting][curr_nbr][left_col] = min_cost;
            return dp[starting][curr_nbr][left_col];
        }
        else{
            int new_nbr = curr_nbr;
            if(houses[starting] != left_col) new_nbr++;
            dp[starting][curr_nbr][left_col] = helper(houses, cost, m, n, target, starting + 1, new_nbr, houses[starting]);
            return dp[starting][curr_nbr][left_col];
        }
    }
}