class LCArray {
    private int[] array;
    private int size = 0;
    private int capacity = 16;

    public LCArray() {
        this.array = new int[this.capacity];
    }
    
    public void push_back(int n) {
        if (this.size < capacity) {
            this.array[this.size] = n;
            this.size++;
        } else {
            this.capacity *= 2;
            int[] temp = new int[this.capacity];
            for (int i = 0; i < this.size; i++) {
                temp[i] = this.array[i];
            }

            this.array = temp;
            this.array[this.size] = n;
            this.size++;
        }
    }
    
    public void pop_back() {
        if (this.size > 0) {
            this.array[this.size - 1] = 0;
            this.size--;
        }
    }
    
    public int size() {
        return this.size;
    }
    
    public int index(int idx) {
        if (idx < 0 || idx > this.size - 1) {
            return -1;
        } 

        return this.array[idx];
    }
}

/**
 * Your LCArray object will be instantiated and called as such:
 * LCArray obj = new LCArray();
 * obj.push_back(n);
 * obj.pop_back();
 * int param_3 = obj.size();
 * int param_4 = obj.index(idx);
 */