class MinStack {
    Stack<Integer> b;
    Stack<Integer> h;
    public MinStack() {
        b=new Stack<>();
        h=new Stack<>();
    }
    
    public void push(int value) {
        b.push(value);
        if(h.isEmpty()||value<=h.peek()){
            h.push(value);
        }
    }
    
    public void pop() {
        if(h.peek().equals(b.peek())){
            h.pop();
        }
        b.pop();
    }
    
    public int top() {
        return b.peek();
    }
    
    public int getMin() {
        return h.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */