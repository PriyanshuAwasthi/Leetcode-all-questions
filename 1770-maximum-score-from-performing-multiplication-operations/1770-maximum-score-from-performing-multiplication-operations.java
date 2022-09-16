class Solution 
{
    public int maximumScore(int[] nums, int[] multipliers) 
    {
        int n=nums.length,m=multipliers.length;
        
        return func(nums,multipliers,0,0,n-1,new Integer[m][m]);
    }
    
    // Using Simple DP template
    private int func(int[] nums,int[] mult,int idx,int left,int right,Integer[][] memo)
    {
        if(idx==mult.length)
            return 0;
        
        if(memo[left][idx]!=null)
            return memo[left][idx];
        
        int take_left=nums[left]*mult[idx] + func(nums,mult,idx+1,left+1,right,memo);
        int take_right=nums[right]*mult[idx] + func(nums,mult,idx+1,left,right-1,memo);
        
        return memo[left][idx]=Math.max(take_left,take_right);
    }
}