class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; ) { ans += nums[i]; i += 2; }
        return ans;
    }
}