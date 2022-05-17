class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        find_subset(0, new ArrayList<>(), res, nums);
        
        return res;
    }
    
    private void find_subset(int i, List<Integer> res2, List<List<Integer>> res, int[] nums){
        res.add(new ArrayList<>(res2));
        for(int a = i; a < nums.length; a++){
            if(a != i && nums[a] == nums[a - 1]) continue;
            res2.add(nums[a]);
            find_subset(a + 1, res2, res, nums);
            res2.remove(res2.size() - 1);
        }
    }
}