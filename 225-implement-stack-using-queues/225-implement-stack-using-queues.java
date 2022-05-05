class MyStack {
    Queue<Integer> help;
    Queue<Integer> help2;
    public MyStack() {
        help = new LinkedList<Integer>();
        help2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        if(help2.isEmpty()) help.offer(x);
        else help2.offer(x);
    }
    
    public int pop() {
    
        if(help.size() > help2.size()){
            if(help.size() == 1) return help.poll();
            while(help.size() != 1){
                help2.offer(help.poll());
            }
            return help.poll();
        }
        else if(help2.size() > help.size()){
            if(help2.size() == 1) return help2.poll();
            while(help2.size() != 1){
                help.offer(help2.poll());
            }
            return help2.poll();
        }
        return 1;
    }
    
    public int top() {
        if(help.size() > help2.size()){
            if(help.size() == 1) return help.peek();
            while(help.size() != 1){
                help2.offer(help.poll());
            }
            int a = help.poll();
            help2.offer(a);
            return a;
        }
        else if(help2.size() > help.size()){
            if(help2.size() == 1) return help2.poll();
            while(help2.size() != 1){
                help.offer(help2.poll());
            }
            int a = help2.poll();
            help.offer(a);
            return a;
        }
        return 1;
    }
    
    public boolean empty() {
        return help.isEmpty() && help2.isEmpty();
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