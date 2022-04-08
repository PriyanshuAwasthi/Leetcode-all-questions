class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        int n = nums.length;
        int []ans = new int[2];
        for(int i = 0; i < n; i++){
            int new_target = target - nums[i];
            if(temp.isEmpty() || !(temp.containsKey(new_target))) temp.put(nums[i], i);
            else if(temp.containsKey(new_target)){
                ans[0] = i;
                ans[1] = temp.get(new_target);
                return ans;
            }
        }
        return ans;
    }
}