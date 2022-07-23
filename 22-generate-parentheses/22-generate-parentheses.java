class Solution {
    public List<String> generateParenthesis(int n) {
        int close = n;
        int open = n;
        List<String> res = new ArrayList<>();
        String op = "";
        helper(res, open, close, op);
        return res;
    }
    public void helper(List<String> res, int open, int close, String op){
        if(open == 0 && close == 0){
            res.add(op);
            return;
        }
        if(open != 0){
            String op1 = op;
            op1 += '(';
            helper(res, open - 1, close, op1);
        }
        if(open < close){
            String op1 = op;
            op1 += ')';
            helper(res, open, close - 1, op1);
        }
    }
}