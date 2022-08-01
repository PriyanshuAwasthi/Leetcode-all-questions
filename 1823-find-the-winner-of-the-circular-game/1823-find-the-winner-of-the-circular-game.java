class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) res.add(i + 1);
        return helper(0, res, k - 1);
    }
    public int helper(int index, List<Integer> res, int k){
        if(res.size() == 1) return res.get(0);
        index = (index + k) % res.size();
        res.remove(index);
        return helper(index, res, k);
    }
}