class Solution {
    public int searchInsert(int[] nums, int target) {
        int c = 0;
        for(int num : nums){
            if (num < target) c++;
            else break;
        }
        return c;
    }
}