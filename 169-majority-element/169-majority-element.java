class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> itterate : res.entrySet()){
            if(itterate.getValue() > n / 2) return itterate.getKey();
        }
        return 0;
    }
}