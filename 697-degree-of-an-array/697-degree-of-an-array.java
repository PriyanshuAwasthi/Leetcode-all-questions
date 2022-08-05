class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        int degree = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            mp2.putIfAbsent(nums[i], i);
            mp1.put(nums[i], mp1.getOrDefault(nums[i], 0) + 1);
            if(mp1.get(nums[i]) > degree){
                degree = mp1.get(nums[i]);
                ans = i - mp2.get(nums[i]) + 1;
            }
            else if(mp1.get(nums[i]) == degree) ans = Math.min(ans, i - mp2.get(nums[i]) + 1);
        }
        return ans;
    }
}