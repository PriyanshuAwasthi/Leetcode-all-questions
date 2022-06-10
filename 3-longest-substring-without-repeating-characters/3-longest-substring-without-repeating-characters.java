class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s==null || s.length()==0 || s.equals("")) return 0;
        
        int start = 0;
        int end = 0;
        int len = 1;
        Set<Character> chrs = new HashSet<>();
        while(end<s.length()) {
            if(!chrs.contains(s.charAt(end))) {
                len = Math.max(end-start+1,len);
                chrs.add(s.charAt(end));
                end++;
            } else {
                while(chrs.contains(s.charAt(end))) {
                    chrs.remove(s.charAt(start++));
                }
            }
        }
        return len;
    }
}