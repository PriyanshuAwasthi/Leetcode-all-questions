class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        int n = nums.length;
        int []ans = new int[2];
        for(int i = 0; i < n; i++){
            int n_target = target - nums[i];
            if(temp.containsKey(n_target)){
                ans[0] = i;
                ans[1] = temp.get(n_target);
                return ans;
            }
            else{
                temp.put(nums[i], i);
            }
        }
        return ans;
    }
}