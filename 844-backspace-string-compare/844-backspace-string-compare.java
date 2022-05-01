class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            switch(String.valueOf(s.charAt(i))){
                case "#":
                    if(!(s1.isEmpty())) s1.pop();
                    break;
                
                default: 
                    s1.push(String.valueOf(s.charAt(i)));
                    break;
            }
        }
        
        for(int j = 0; j < t.length(); j++){
            switch(String.valueOf(t.charAt(j))){
                case "#":
                    if(!(s2.isEmpty())) s2.pop();
                    break;
                    
                default:
                    s2.push(String.valueOf(t.charAt(j)));
                    break;
            }
        }
        if(s1.equals(s2)) return true;
        else return false;
    } 
}