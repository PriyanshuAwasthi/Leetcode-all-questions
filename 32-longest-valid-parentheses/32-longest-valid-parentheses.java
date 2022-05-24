class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> temp = new Stack<>();
        int count = 0;
        int max = 0;
        temp.push(-1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') temp.push(i);
            else if(s.charAt(i) == ')'){
                temp.pop();
                if(temp.isEmpty()) temp.push(i);
                else count = i - temp.peek();
                if(max < count) max = count;
            }
        }
        return max;
    }
}