class Solution {
    public boolean backspaceCompare(String s, String t) {
        int s_itt = s.length() - 1;
        int t_itt = t.length() - 1;
        
        int s_jump = 0;
        int t_jump = 0;
        
        while(s_itt >= 0 || t_itt >= 0){
            while(s_itt >= 0){
                if(s.charAt(s_itt) == '#'){
                    s_jump++;
                    s_itt--;
                }
                else if(s_jump > 0){
                    s_itt--;
                    s_jump--;
                }
                else break;
            }
            
            while(t_itt >= 0){
                if(t.charAt(t_itt) == '#'){
                    t_jump++;
                    t_itt--;
                }
                else if(t_jump > 0){
                    t_itt--;
                    t_jump--;
                }
                else break;
            }
            
            if(s_itt >= 0 && t_itt >= 0 && s.charAt(s_itt) != t.charAt(t_itt)) return false;
            
            if((s_itt >= 0) != (t_itt >= 0)) return false;
            
            s_itt--;
            t_itt--;
        }
        
        return true;
    }
}