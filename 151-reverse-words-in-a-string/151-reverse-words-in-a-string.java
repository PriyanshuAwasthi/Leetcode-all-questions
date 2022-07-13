class Solution {
    public String reverseWords(String s) {
        String res = new String();
        int n = s.length();
        int i = n - 1;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' ') i--;
            if(i < 0) break;
            int j = i;
            while(i >= 0 && s.charAt(i) != ' ') i--;
        
            if(res.length() == 0) res = res.concat(s.substring(i + 1, j + 1));
            else res = res.concat(" "+s.substring(i + 1, j + 1));
        }
        return res;
    }
}