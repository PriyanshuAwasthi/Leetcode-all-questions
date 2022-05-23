class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<List<Integer>>();
        boolean []check = new boolean[nums.length];
        helper(nums, check, new ArrayList<>());
        return ans;
    }
    
    private void helper(int []nums, boolean []check, List<Integer> res){
        if(res.size() == nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!check[i]){
                check[i] = true;
                res.add(nums[i]);
                helper(nums, check, res);
                res.remove(res.size() - 1);
                check[i] = false;
            }
        }
    }
}