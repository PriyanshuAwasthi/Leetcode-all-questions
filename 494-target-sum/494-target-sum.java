class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums) sum += num;
    
        int dum = (target + sum) / 2;
        int n = nums.length;
        dum = Math.abs(dum);
    
        if(sum < Math.abs(target) || (sum + target) % 2 != 0) return 0;
       
        int dp[][] = new int[n + 1][dum + 1];
       
        for(int j = 1; j < dum + 1; j++) dp[0][j] = 0;
       
        for(int i = 0; i < n + 1; i++) dp[i][0] = 1; 
        
        
        for(int i = 1; i < n + 1; i++){
     
            for(int j = 0; j < dum + 1; j++){
               
                if(j >= nums[i - 1]) dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
             
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][dum]; 
    }
}
/*class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sum = 0;
        for(int x : nums){sum += x;}
        
        //CALCULATE THE VALUE OF w WITH THIS
        int w = (target+sum)/2;
        int n = nums.length;
        
        //correction 
        if(sum < target || (sum + target) % 2 != 0){return 0;}
        w= Math.abs(w);
    
        int t[][] = new int[n+1][w+1];
        
        for(int i =0; i<w+1; i++){t[0][i] = 0;}
        for(int i =0; i<n+1; i++){t[i][0] = 1;}
        
        for(int i= 1; i<n+1; i++)
        {
            for(int j = 0; j<w+1; j++)
            {
                if(nums[i-1] <= j)
                {
                    t[i][j] = t[i-1][j-nums[i-1]] + t[i-1][j];
                }else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        return t[n][w];
    }
}*/
