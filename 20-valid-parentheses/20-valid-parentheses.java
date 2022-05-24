class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack1.push(s.charAt(i));
            }
            
            else if(s.charAt(i) == ')'){
                if(stack1.isEmpty()) return false;
                if(stack1.peek() == '(') stack1.pop();
                else return false;
            }
            
            else if(s.charAt(i) == '}'){
                if(stack1.isEmpty()) return false;
                if(stack1.peek() == '{') stack1.pop();
                else return false;
            }
            
            else if(s.charAt(i) == ']'){
                if(stack1.isEmpty()) return false;
                if(stack1.peek() == '[') stack1.pop();
                else return false;
            }
        }
        if(stack1.isEmpty()) return true;
        return false;
    }
}