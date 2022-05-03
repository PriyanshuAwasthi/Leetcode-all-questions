class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i - 1])
                min = Math.min(min, nums[i]);
        }
        
       
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] > nums[i + 1])
                max = Math.max(max, nums[i]);
        }
        
        int l, r;
        for(l = 0; l < n; l++){
            if(min < nums[l])
                break;
        }
        
        for(r = n - 1; r >= 0; r--){
            if(max > nums[r])
                break;
        }
        
        return (r - l > 0) ? r - l + 1 : 0;
    }
}