```
class Solution {
public String removeDuplicates(String s, int k) {
Stack<Character> st1 = new Stack<Character>();
Stack<Character> st2 = new Stack<Character>();
for(int i = 0; i < s.length(); i++){
if(st1.isEmpty()) st1.push(s.charAt(i));
else{
st2.push(s.charAt(i));
if(st1.peek() == st2.peek()){
while(!st1.isEmpty() && st1.peek() == st2.peek()){
st2.push(st1.pop());
if(st2.size() == k){
while(!st2.isEmpty()) st2.pop();
}
break;
}
}
else{
st1.push(st2.pop());
}
}
}
StringBuilder res = new StringBuilder();
while(!st1.isEmpty()){
res.append(st1.pop());
}
return res.reverse().toString();
}
}