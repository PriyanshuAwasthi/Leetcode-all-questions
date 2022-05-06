class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int curr = 0;
        int i = 0;
        while(i < n){
            if(nums[i] == 1) curr++;
            else curr = 0;
            i++;
            if(curr > max) max = curr;
        }
        return max;
    }
}