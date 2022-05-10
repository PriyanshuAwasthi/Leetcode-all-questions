class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> res2 = new ArrayList<Integer>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        int min = (k * (k + 1)) / 2;
        if(n < min) return res;
        
        
        help_me(k, n, 1);
        return res;
    }
    
    private void help_me(int k, int n, int start){
        if(n == 0 && k == res2.size()){
            res.add(new ArrayList<>(res2));
            return;
        }
        
        for(int j = start; j <= 9; j++){
            res2.add(j);
            help_me(k, n - j, j + 1);
            res2.remove(res2.size() - 1);
        }
    }
}