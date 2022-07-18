class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        char c = needle.charAt(0);;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == c){
                int m = i;
                int a = i + n;
                if(a < haystack.length() && haystack.substring(m, a).equals(needle)) return i;
                else if(a == haystack.length() && haystack.substring(m).equals(needle)) return i;
            }
        }
        return -1;
    }
}