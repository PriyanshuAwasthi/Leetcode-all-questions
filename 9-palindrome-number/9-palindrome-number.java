class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x >= 0 && x < 10) return true;
        String temp = "";
        temp += x;
        int n = temp.length();
        int start = (n % 2 == 0) ? (n / 2) - 1 : n / 2;
        int end = n / 2;
        while(start >= 0 && end < n) if(temp.charAt(start--) != temp.charAt(end++)) return false;
        return true;
    }
}