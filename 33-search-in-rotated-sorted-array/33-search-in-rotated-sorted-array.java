class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        
        while(end >= start){
            int mid = (start + end) >> 1;
            if(nums[mid] == target) return mid;
            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target <= nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(nums[end] >= nums[mid]){
                    if(target >= nums[mid] && target <= nums[end]) start = mid + 1;
                    else end = mid - 1;
                }
            }
        }
        return -1;
    }
}