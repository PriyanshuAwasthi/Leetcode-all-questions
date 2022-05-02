class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int t = 0;
        int temp = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]%2 == 0){
                temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t++;
            }
        }
        return nums;    
    }
}