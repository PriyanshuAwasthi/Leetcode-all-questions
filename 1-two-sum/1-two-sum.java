class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        int n = nums.length;
        int []ans = new int[2];
        for(int i = 0; i < n; i++){
            if(temp.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = temp.get(target - nums[i]);
                return ans;
            }
            else{
                temp.put(nums[i], i);
            }
        }
        return ans;
    }
}