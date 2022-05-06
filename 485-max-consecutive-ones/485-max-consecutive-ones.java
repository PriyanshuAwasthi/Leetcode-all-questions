class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int curr = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 1) curr++;
            else{curr = 0; i++; continue;}
            i++;
            if(curr > max) max = curr;
        }
        return max;
    }
}