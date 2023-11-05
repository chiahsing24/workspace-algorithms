class MyStack {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();

    public MyStack() {
    }
    
    public void push(int x) {
        this.queue1.offer(x);
    }
    
    public int pop() {
        if (!empty()) {
            while (this.queue1.size() > 0) {
                int value = this.queue1.poll();
                if (this.queue1.size() == 0) {
                    return value;
                } else {
                    this.queue2.offer(value);
                }
            }

            while (this.queue2.size() > 0) {
                int value = this.queue2.poll();
                if (this.queue2.size() == 0) {
                    return value;
                } else {
                    this.queue1.offer(value);
                }
            }
        }

        return -1;
    }
    
    public int top() {
        if (!empty()) {
            while (this.queue1.size() > 0) {
                int value = this.queue1.poll();
                this.queue2.add(value);
                if (this.queue1.size() == 0) {
                    return value;
                }
            }

            while (this.queue2.size() > 0) {
                int value = this.queue2.poll();
                this.queue1.add(value);
                if (this.queue2.size() == 0) {
                    return value;
                }
            }
        }

        return -1;
    }
    
    public boolean empty() {
        return this.queue1.size() == 0 && this.queue2.size() == 0;
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