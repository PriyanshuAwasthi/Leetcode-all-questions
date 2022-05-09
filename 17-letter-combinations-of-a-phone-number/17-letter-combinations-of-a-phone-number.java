class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0) return res;
        String []arr = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder help = new StringBuilder();
        
        backtrack(digits, help, 0, arr, res);
        return res;
    }
    
    private void backtrack(String digits, StringBuilder help, int i, String arr[], List<String> res){
        if(i == digits.length()){
            res.add(help.toString());
            return;
        }
        
        String curr = arr[Character.getNumericValue(digits.charAt(i))];
        for(int j = 0; j < curr.length(); j++){
            help.append(curr.charAt(j));
            backtrack(digits, help, i + 1, arr, res);
            help.deleteCharAt(help.length() - 1);
        }
    }
}