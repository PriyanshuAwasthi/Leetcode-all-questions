class Solution {
    int max_len;
    int res_start;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2) return s;
        for(int i = 0; i < n; i++){
            helper(s, i, i);
            helper(s, i, i + 1);
        }
        return s.substring(res_start, res_start + max_len);
    }
    
    public void helper(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if(max_len < end - start - 1){
            max_len = end - start - 1;
            res_start = start + 1;
        }
    }
}