class Solution {
    public int dp[][];
    public int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        
        helper(target, nums, 0, 0);
        return count;
    }
    public void helper(int target, int nums[], int ind, int dummy){
        if(ind == nums.length){
            if(dummy == target) count++;
            return;
        }
        helper(target, nums, ind + 1, dummy + nums[ind]);
        helper(target, nums, ind + 1, dummy - nums[ind]);
    }
}