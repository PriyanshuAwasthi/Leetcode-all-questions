class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean arr[][] = new Boolean[s1.length() + 1][s2.length() + 1];
        if(s1.length() + s2.length() != s3.length()) return false;
        return helper(s1, s2, s3, 0, 0, arr);
    }
    public boolean helper(String s1, String s2, String s3, int row, int col, Boolean arr[][]){
        if(row == s1.length() && col == s2.length()) return true;
        else if(arr[row][col] != null) return arr[row][col];
        
        if(row < s1.length() && s1.charAt(row) == s3.charAt(row + col) && helper(s1, s2, s3, row + 1, col, arr)) return true;
        
        if(col < s2.length() && s2.charAt(col) == s3.charAt(row + col) && helper(s1, s2, s3, row, col + 1, arr)) return true;
        
        arr[row][col] = false;
        return false;
    }
}