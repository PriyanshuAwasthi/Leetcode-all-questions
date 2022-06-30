class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int start = 0;
        int end = n - 1;
        while(start != end && end > start) ans += nums[end--] - nums[start++];
        return ans;
    }
}