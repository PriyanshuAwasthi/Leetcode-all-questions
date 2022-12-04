class Solution {
    public int minimumAverageDifference(int[] nums) {
        long ans = Integer.MAX_VALUE;
        int ans_ind = 0;
        if(nums.length == 0) return 0;
        long sum_pre = 0;
        long sum_total = 0;
        for(int i = 0; i < nums.length; i++) sum_total += nums[i];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum_pre += nums[i];
            long sum_after = sum_total - sum_pre;
            long temp = Math.abs(sum_pre / (i + 1));
            long temp2 = (i != n - 1) ? Math.abs(sum_after / (n - (i + 1))) : 0;
            // System.out.println(sum_pre + " " + sum_after + " " + temp + " " + temp2);
            if(Math.abs(temp - temp2) < ans) {
                ans = Math.abs(temp - temp2);
                ans_ind = i;
            }
        }
        return ans_ind;
    }
}