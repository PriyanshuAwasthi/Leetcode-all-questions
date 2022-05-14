class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        find_subset(0, new ArrayList<>(), res, nums);
        return res;
    }
    
    private void find_subset(int i, List<Integer> res2, List<List<Integer>> res, int[] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(res2));
            return;
        }
        res2.add(nums[i]);
        find_subset(i + 1, res2, res, nums);
        res2.remove(res2.size() - 1);
        find_subset(i + 1, res2, res, nums);
        
    }
}