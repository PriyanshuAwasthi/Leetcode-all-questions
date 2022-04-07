class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> itt : res.entrySet()){
            if(itt.getValue() > n / 3) ans.add(itt.getKey());
        }
        return ans;
    }
}