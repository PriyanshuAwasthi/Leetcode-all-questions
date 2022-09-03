class Solution {
    public Set<Integer> temp;
    public int K;
    public int[] numsSameConsecDiff(int n, int k) {
        temp = new HashSet<>();
        K = k;
        if(n == 1) return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 1; i <= 9; i++) helper(i, n - 1); 
        Integer t[] = new Integer[temp.size()];
        temp.toArray(t);
        int arr[] = new int[t.length];
        for(int i = 0; i < t.length; i++) arr[i] = t[i].intValue();
        return arr;
    }
    public void helper(int curr, int left){
        if(left == 0){
            temp.add(curr);
            return;
        }
        int current = curr % 10;
        if(current + K <= 9) helper(curr * 10 + current + K, left - 1);
        if(current - K >= 0) helper(curr * 10 + current - K, left - 1);
    }
}