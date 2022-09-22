class Solution {
    public String reverseWords(String s) {
        String []temp = s.split(" ");
        String ans = "";
        for(String st : temp){
            StringBuilder t = new StringBuilder(st);
            ans += t.reverse().toString();
            ans += " ";
        }
        return ans.trim();
    }
}