class Solution {
    List<String> res;
    Set<String> temp;
    public List<String> wordBreak(String s, List<String> wordDict) {
        res = new ArrayList<>();
        temp = new HashSet<>();
        for(String st : wordDict) temp.add(st);
        int ind = 0;
        helper(s, 0, "");
        return res;
    }
    public void helper(String s, int index, String curr){
        if(index == s.length()){
            res.add(curr.trim());
            return;
        }
        for(int i = index; i < s.length(); i++){
            String tp = s.substring(index, i + 1);
            if(temp.contains(tp)) helper(s, i + 1, curr + tp + " ");
        } 
    }
}