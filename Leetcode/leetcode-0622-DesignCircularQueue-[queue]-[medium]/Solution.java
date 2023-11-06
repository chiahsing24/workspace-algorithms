class MyCircularQueue {
    int[] array = null;
    int size = 0;
    int frontPtr = 0;
    int rearPtr = 0;

    public MyCircularQueue(int k) {
        array = new int[k];
    }
    
    public boolean enQueue(int value) {
        if (!isFull()) {
            if (size == 0) {
                array[frontPtr] = value;
                array[rearPtr] = value;
            } else {
                rearPtr = (rearPtr + 1) % array.length;
                array[rearPtr] = value;
            }

            size++;

            return true;
        } 
        
        return false;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        size--;
        if (size > 0) {
            frontPtr = (frontPtr + 1) % array.length;
        }
        
        
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : array[frontPtr];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : array[rearPtr];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == array.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */