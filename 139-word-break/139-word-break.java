class Solution {
    //Map<Integer, Boolean> mp;
    public int []dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        //mp = new HashMap<>();
        dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        Set<String> temp = new HashSet<>();
        for(int i = 0; i < wordDict.size(); i++) temp.add(wordDict.get(i));
        if(temp.contains(s)) return true;
        return helper(s, 0, temp);
    }
    public boolean helper(String s, int i, Set<String> temp){
        if(i == s.length()) return true;
        //if(mp.containsKey(i)) return mp.get(i);
        if(dp[i] != -1) return (dp[i] == 1) ? true : false;
        for(int j = i; j <= s.length(); j++){
            if(temp.contains(s.substring(i, j)) && helper(s, j, temp)){
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = 0;
        return false;
    }
}