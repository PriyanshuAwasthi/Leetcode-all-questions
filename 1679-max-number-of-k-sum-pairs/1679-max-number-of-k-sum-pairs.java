class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.parallelSort(nums);
        int n = nums.length;
        int left = 0;
        int right = n- 1;
        int count = 0;
        while(left < right && left != right){
            int target = nums[left] + nums[right];
            if(target > k) --right;
            else if(target < k) ++left;
            else{
                count++;
                ++left;
                --right;
            }
        }
        return count;
    }
}