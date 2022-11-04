// class Solution {
//     public String reverseVowels(String s) {
//         HashMap<Integer, Character> hm = new HashMap<>();
//         List<Integer> ls = new ArrayList<>();
//         for(int i = 0; i < s.length(); i++) if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||  s.charAt(i) == 'i' ||  s.charAt(i) == 'o' ||  s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' ||  s.charAt(i) == 'I' ||  s.charAt(i) == 'O' ||  s.charAt(i) == 'U'){
//             hm.put(i, s.charAt(i));
//             ls.add(i);
//         }
//         Collections.sort(ls);
//         char c[] = s.toCharArray();
//         int i = 0;
//         int j = ls.size() - 1;
//         while(i < j){
//             int a = ls.get(i++);
//             int b = ls.get(j--);
//             char temp = c[a];
//             c[a] = hm.get(b);
//             c[b] = temp;
//         }
//         return new String(c);
//     }
// }
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char ch[] = s.toCharArray();
        while(i < j){
            while(i < s.length() && !helper(ch[i])) i++;
            while(j >= 0 && !helper(ch[j])) j--;
            if(i < j) helper2(i++, j--, ch);
        }
        return new String(ch);
    }
    public boolean helper(char c){ return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'; }
    public void helper2(int i, int j, char c[]){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}