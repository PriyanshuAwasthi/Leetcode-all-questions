class Solution {
    Map<Integer, Boolean> mp;
    public boolean wordBreak(String s, List<String> wordDict) {
        mp = new HashMap<>();
        Set<String> temp = new HashSet<>();
        for(int i = 0; i < wordDict.size(); i++) temp.add(wordDict.get(i));
        int ind = 0;
        if(temp.contains(s)) return true;
        /*for(int i = 0; i < s.length(); i++){
            if(temp.contains(s.substring(ind, i))){
                return helper(s, i, temp);
            }
        }*/
        return helper(s, 0, temp);
    }
    public boolean helper(String s, int i, Set<String> temp){
        if(i == s.length()) return true;
        if(mp.containsKey(i)) return mp.get(i);
        for(int j = i; j <= s.length(); j++){
            if(temp.contains(s.substring(i, j)) && helper(s, j, temp)){
                mp.put(i, true);
                return true;
            }
        }
        mp.put(i, false);
        return false;
    }
}