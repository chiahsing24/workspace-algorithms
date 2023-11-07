class MyQueue {
    Stack<Integer> stack = null;
    Stack<Integer> backupStack = null;

    public MyQueue() {
        stack = new Stack<>();  
        backupStack = new Stack<>();  
    }   
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        int value = -1;
        if (!backupStack.empty()) {
            value = backupStack.pop();
            return value;
        }

        while (!stack.empty()) {
            value = stack.pop();
            if (stack.empty()) {
                return value;
            }

            backupStack.push(value);
        }

        return value;
    }
    
    public int peek() {
        int value = -1;
        if (!backupStack.empty()) {
            value = backupStack.pop();
            backupStack.push(value);
            return value;
        }

        while (!stack.empty()) {
            value = stack.pop();
            backupStack.push(value);
            if (stack.empty()) {
                return value;
            }
        }

        return value;
    }
    
    public boolean empty() {
        return stack.empty() && backupStack.empty();
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