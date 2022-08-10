class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        String res = "";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(str1.charAt(i - 1) == str2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int i = n, j = m;
        while(i > 0 && j > 0){
            if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                res = str1.charAt(i - 1) + res;
                i--;
                j--;
            }
            else if(dp[i - 1][j] > dp[i][j - 1]){
                res = str1.charAt(i - 1) + res;
                i--;
            }
            else{
                res = str2.charAt(j - 1) + res;
                j--;    
            }
        }
        while(i > 0){
            res = str1.charAt(i - 1) + res;
            i--;
        }
        while(j > 0){
            res = str2.charAt(j - 1) + res;
            j--;
        }
        return res;
    }
}