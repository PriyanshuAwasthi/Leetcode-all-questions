class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int med = 0;
        if(n % 2 == 1) med = nums[n / 2];
        else med = (nums[n / 2] + nums[n / 2 - 1]) / 2;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int temp = nums[i] - med;
            ans += Math.abs(temp);
        }
        return ans;
    }
}