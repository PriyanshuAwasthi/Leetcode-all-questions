class Solution {
    public Set<String> temp;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<String>();
        if(words.length == 0) return ans;
        temp = new HashSet<>();
        for(String st : words) temp.add(st);
        for(String st : words) if(helper(st)) ans.add(st);
        return ans;
    }
    public boolean helper(String tp){
        int n = tp.length();
        for(int i = 1; i < n; i++){
            String after = tp.substring(i);
            if(temp.contains(tp.substring(0, i)) && (temp.contains(after) || helper(after))) return true;
        }
        return false;
    }
}