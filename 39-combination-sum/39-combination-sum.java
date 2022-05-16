class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        find_subset(target, ans, new ArrayList<>(), 0, candidates);
        return ans;
    }
    
    private void find_subset(int target, List<List<Integer>> ans, List<Integer> ans2, int i, int[] candidates){
        if(i == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ans2));
            }
            return;
        }
        if(candidates[i] <= target){
            ans2.add(candidates[i]);
            find_subset(target - candidates[i], ans, ans2, i, candidates);
            ans2.remove(ans2.size() - 1);
        }
        
        find_subset(target, ans, ans2, i + 1, candidates);
        
    }
}