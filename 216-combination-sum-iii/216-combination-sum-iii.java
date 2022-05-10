class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int min = (k * (k + 1)) / 2;
        if(n < min) return res;
        
        
        help_me(res, new ArrayList<Integer>(), k, n, 1);
        return res;
    }
    
    private void help_me(List<List<Integer>> res, List<Integer> res2, int k, int n, int start){
        if(n == 0 && k == res2.size()){
            res.add(new ArrayList<>(res2));
            return;
        }
        
        for(int j = start; j <= 9; j++){
            res2.add(j);
            help_me(res, res2, k, n - j, j + 1);
            res2.remove(res2.size() - 1);
        }
    }
}