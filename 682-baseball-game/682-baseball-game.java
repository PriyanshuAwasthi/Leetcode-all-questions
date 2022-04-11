class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> res = new Stack<>();
        int n = ops.length;

        for(int i = 0; i < n; i++){
            switch(ops[i]){
                case "+":
                    int last = res.pop();
                    int second_last = res.peek();
                    res.push(last);
                    res.push(last + second_last);
               
                    break;
                    
                case "D":
                    res.push(res.peek() * 2);

                    break;
                    
                case "C":
                
                    res.pop();
                    break;
                    
                default:
                    res.push(Integer.valueOf(ops[i]));
                   
                    break;
            }
        }
        
        int sum = 0;
        for(int a : res){
            sum += a;
        }
        return sum;
    }
}