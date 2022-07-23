class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        String op = "";
        helper(op, s.toLowerCase(), res);
        return res;
    }
    
    public void helper(String op, String s, List<String> res){
        if(s.length() == 0){
            res.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        if(s.charAt(0) >= '0' && s.charAt(0) <= '9'){
            op1 += s.charAt(0);
            helper(op1, s.substring(1), res);
        }
        else{
            op1 += Character.toUpperCase(s.charAt(0));
            op2 += s.charAt(0);
            helper(op1, s.substring(1), res);
            helper(op2, s.substring(1), res);
        }
    }
}