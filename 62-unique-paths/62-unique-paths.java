class Solution {
    public int uniquePaths(int m, int n) {
        int k = m + n - 2;
        int x = m - 1;
        double ans = 1;
        for(int i = 1; i <= x; i++){
            ans = ans * (k - x + i) / i; 
        }
        return (int)ans;
    }
}