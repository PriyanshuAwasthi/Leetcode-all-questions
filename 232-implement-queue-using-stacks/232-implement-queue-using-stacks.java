class MyQueue {
    Stack<Integer> q1;
    Stack<Integer> q2;
    public MyQueue() {
        q1 = new Stack<>();
        q2 = new Stack<>();
    }
    
    public void push(int x) {
        if(q2.isEmpty() && q1.isEmpty()) q2.push(x);
        else if(q2.isEmpty()){
            while(!q1.isEmpty()) q2.push(q1.pop());
            q2.push(x);
        }
        else q2.push(x);
    }
    
    public int pop() {
        if(q1.isEmpty() && q2.isEmpty()) return 0;
        else if(q1.isEmpty()){
            while(!q2.isEmpty()) q1.push(q2.pop());
            return q1.pop();
        }
        else return q1.pop();
    }
    
    public int peek() {
        if(q1.isEmpty() && q2.isEmpty()) return 0;
        else if(q1.isEmpty()){
            while(!q2.isEmpty()) q1.push(q2.pop());
            return q1.peek();
        }
        else return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */