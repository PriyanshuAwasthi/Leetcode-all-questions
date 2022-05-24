class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> temp = new Stack<>();
        int i = 0;
        int count = 0;
        int max = 0;
        temp.push(-1);
        while(i < s.length()){
            if(s.charAt(i) == '(') temp.push(i);
            else if(s.charAt(i) == ')'){
                temp.pop();
                if(temp.isEmpty()) temp.push(i);
                else count = i - temp.peek();
                if(max < count) max = count;
            }
            i++;
        }
        return max;
    }
}