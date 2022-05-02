class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end){
            if(nums[start] % 2 > nums[end] % 2){
                int t = nums[start];
                nums[start] = nums[end];
                nums[end] = t;
            }
            
            if(nums[start] % 2 == 0) start++;
            if(nums[end] % 2 == 1) end--;
        }
        
        return nums;
    }
}