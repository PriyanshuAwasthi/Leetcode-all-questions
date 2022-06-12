class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int left =0;
        int maxSum = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        for(int right=0;right<nums.length;right++){
            
            while(left<=right && set.contains(nums[right])){
                // System.out.println(nums[left]+"removr");
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
              // System.out.println(nums[right]);
            set.add(nums[right]);
            sum+=nums[right];
            maxSum = Math.max(maxSum,sum);
        }
        // System.out.println(set);
        return maxSum;
        
    }
}