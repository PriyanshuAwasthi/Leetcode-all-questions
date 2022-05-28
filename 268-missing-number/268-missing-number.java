class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++){
            if(i != nums[i]) return i;
            else if(i == n - 1 && nums[i] == i) return n;
        }
        return 0;
        
    }
    
}