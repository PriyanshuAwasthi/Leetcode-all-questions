class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.parallelSort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        find_subset(target, ans, new ArrayList<>(), 0, candidates);
        
        return ans;
    }
    
    private void find_subset(int target, List<List<Integer>> ans, List<Integer> ans2, int i, int[] candidates){
        if(target == 0){ans.add(new ArrayList<>(ans2)); return;}
        for(int a = i; a < candidates.length; a++){
            if(a != i && candidates[a] == candidates[a - 1]) continue;
            if(candidates[a] > target) break;
            ans2.add(candidates[a]);
            find_subset(target - candidates[a], ans, ans2, a + 1, candidates);
            ans2.remove(ans2.size() - 1);
        }
    }
}