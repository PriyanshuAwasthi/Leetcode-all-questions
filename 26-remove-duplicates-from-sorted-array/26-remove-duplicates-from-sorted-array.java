class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int pointer = 0;
        int head = 1;
        while(head < n){
            if(nums[head] == nums[pointer]) head++;
            else{
                pointer++;
                nums[pointer] = nums[head];
            }
        }
        
        return pointer + 1;
    }
}