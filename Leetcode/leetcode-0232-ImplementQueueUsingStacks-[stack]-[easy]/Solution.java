class MyQueue {
    public Stack<Integer> pushStack;
    public Stack<Integer> popStack;
    
    public MyQueue() {
        this.pushStack = new Stack<Integer>();
        this.popStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.pushStack.push(x);
    }
    
    public int pop() {
        if (!this.popStack.isEmpty()) {
            return this.popStack.pop();
        } else {
            while (!this.pushStack.isEmpty()) {
                this.popStack.push(this.pushStack.pop());
            }
            return this.popStack.pop();
        }
    }
    
    public int peek() {
        if (!this.popStack.isEmpty()) {
            return this.popStack.peek();
        } else {
            while (!this.pushStack.isEmpty()) {
                this.popStack.push(this.pushStack.pop());
            }
            return this.popStack.peek();
        }
    }
    
    public boolean empty() {
        return this.pushStack.isEmpty() && this.popStack.isEmpty();
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