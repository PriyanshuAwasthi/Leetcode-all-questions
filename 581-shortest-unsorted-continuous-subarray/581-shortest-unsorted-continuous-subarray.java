class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int nums2[] = nums.clone();
        Arrays.sort(nums);
        int n = nums.length;
        int start = 0, end = n - 1;
        int i = 0;
        while(i < n && nums[i] == nums2[i])
            ++i;
        start = i;
        i = n - 1;
        while(i >= 0 && nums[i] == nums2[i])
            i--;
        end = i;
        
        return (end - start > 0) ? end - start + 1 : 0;
    }
}