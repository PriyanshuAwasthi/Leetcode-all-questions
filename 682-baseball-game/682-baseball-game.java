class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> res = new Stack<>();
        int n = ops.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            switch(ops[i]){
                case "+":
                    int last = res.pop();
                    int second_last = res.peek();
                    res.push(last);
                    res.push(last + second_last);
                    sum += res.peek();
                    break;
                    
                case "D":
                    res.push(res.peek() * 2);
                    sum += res.peek();
                    break;
                    
                case "C":
                    sum -= res.peek();
                    res.pop();
                    break;
                    
                default:
                    res.push(Integer.valueOf(ops[i]));
                    sum += res.peek();
                    break;
            }
        }
        
        
        return sum;
    }
}