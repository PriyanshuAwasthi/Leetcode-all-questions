class MyStack {
    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(q1.isEmpty()) q2.add(x);
        else q1.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty()){
            while(q2.size() > 1){
                q1.add(q2.poll());
            }
            return q2.poll();
        }
        else{
            while(q1.size() > 1){
                q2.add(q1.poll());
            }
            return q1.poll();
        }
    }
    
    public int top() {
        if(q1.isEmpty()){
            while(q2.size() > 1){
                q1.add(q2.poll());
            }
            int temp = q2.peek();
            q1.add(q2.poll());
            return temp;
        }
        else{
            while(q1.size() > 1){
                q2.add(q1.poll());
            }
            int temp = q1.peek();
            q2.add(q1.poll());
            return temp;
        }
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */