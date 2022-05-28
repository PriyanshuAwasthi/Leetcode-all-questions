class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] - 1 == i || nums[i] == 0) continue;
            else{
                swap(nums, nums[i], i);
            }
            i--;
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) return i + 1;
        }
        return 0;
        
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a - 1];
        nums[a - 1] = a;
        nums[b] = temp;
    }
}