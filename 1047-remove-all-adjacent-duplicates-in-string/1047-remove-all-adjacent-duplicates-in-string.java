// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> s1 = new Stack<>();
//         for(int i = 0; i < s.length(); i++){
//             if(s1.size() >= 1 && s.charAt(i) == s1.peek()) s1.pop();
//             else s1.push(s.charAt(i));
//         }
//         StringBuilder ans = new StringBuilder();
//         Iterator<Character> value1 = s1.iterator();
//         while(value1.hasNext()) ans.append(value1.next().toString());
//         return ans.toString();
//     }
// }
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> temp = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(temp.size() >= 1 && temp.peek() == s.charAt(i)) temp.pop();
            else temp.push(s.charAt(i));
        }
        StringBuilder sb =  new StringBuilder();
        while(!temp.isEmpty()) sb.append(temp.pop());
        return sb.reverse().toString();
    }
}