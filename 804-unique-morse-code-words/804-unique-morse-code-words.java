class Solution {
    public String []check;
    public int uniqueMorseRepresentations(String[] words) {
        check = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<String>();
        for(String w : words) set.add(helper(w));
        return set.size();
    }
    public String helper(String word){
        String ans = "";
        for(int i = 0; i < word.length(); i++) ans += check[(int)word.charAt(i) - 'a'];
        return ans;
    }
}