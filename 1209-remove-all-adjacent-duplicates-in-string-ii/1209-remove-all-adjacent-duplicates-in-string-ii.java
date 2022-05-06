class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        char []ch_arr = s.toCharArray();
        for(char c : ch_arr){
            if(!st.isEmpty() && st.peek().c == c && st.peek().n < k){
                st.peek().n += 1;
                if(st.peek().n == k) st.pop();
            }
            else st.push(new Pair(c, 1));
        }
        
        StringBuilder res = new StringBuilder("");
        while(!st.isEmpty()){
            int n = st.peek().n;
            char x = st.peek().c;
            for(int i = 0; i < n; i++){
                res.append(x);
            }
            st.pop();
        }
        
        return res.reverse().toString();
    }
    class Pair{
        char c;
        int n;
        Pair(char c, int n){
            this.c = c;
            this.n = n;
        }
    }
}