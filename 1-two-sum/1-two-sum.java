class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        int n = nums.length;
        int ans[] = new int[2];
        for(int i = 0; i < n; i++){
            int new_targ = target - nums[i];
            if(res.containsKey(new_targ)){
                ans[0] = i;
                ans[1] = res.get(new_targ);
            }
            else res.put(nums[i], i);
        }
        
        return ans;
    }
}