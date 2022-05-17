class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        findpalindrome(0, s, res, new ArrayList<>());
        return res;
    }
    
    private void findpalindrome(int i, String s, List<List<String>> res, List<String> temp){
        if(i == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int a = i; a < s.length(); a++){
            if(isPalindrome(s, i, a)){
                temp.add(s.substring(i, a + 1));
                findpalindrome(a + 1, s, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}