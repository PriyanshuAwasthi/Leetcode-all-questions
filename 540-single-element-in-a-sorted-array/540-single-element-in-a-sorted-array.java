class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while(i < n){
            if(i == n - 1) return nums[i];
            else if(nums[i] == nums[j]){
                i += 2;
                j += 2;
            }
            else return nums[i];
        }
        return 0;
    }
}