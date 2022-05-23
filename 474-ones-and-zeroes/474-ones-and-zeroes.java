class Solution {
    int [][]dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m + 1][n + 1];
        for(String str : strs){
            int []count = count(str);
            for(int zero = m; zero >= count[0]; zero--){
                for(int one = n; one >= count[1]; one--){
                    int a = 1 + dp[zero - count[0]][one - count[1]];
                    int b = dp[zero][one];
                    if(a > b) dp[zero][one] = a;
                    else dp[zero][one] = b;
                }
            }
        }
        return dp[m][n];
    }
    
    private int[] count(String str){
        int count[] = new int[2];
        for(char c : str.toCharArray()){
            if(c == '0') count[0]++;
            else count[1]++;
        }
        return count;
    }
}