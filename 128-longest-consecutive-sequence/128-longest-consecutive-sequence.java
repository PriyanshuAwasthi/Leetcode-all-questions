class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int sub = 1;
        int max = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
            if(nums[i]+1 == nums[i+1] ){
                sub++;
            }
            else{
                max = Math.max(max,sub);
                sub = 1;
                }
            }
        }
        return Math.max(max,sub);
    }
    
}