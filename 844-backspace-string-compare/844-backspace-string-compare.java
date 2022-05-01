class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = backspace(s);
        String s2 = backspace(t);
        
        return s1.equals(s2);
    }
    
    public String backspace(String s){
        int n = s.length() - 1;
        int count = 0;
        StringBuilder res = new StringBuilder();
        for(int i = n; i >= 0; i--){
            if(s.charAt(i) == '#'){
                count++;
            }
            else if(count != 0){
                count--;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        
        return res.toString();
    }
}