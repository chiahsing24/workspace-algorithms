class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    private int size;
    private ListNode head;
    private ListNode tail;
    
    public MyLinkedList() {
        this.size = 0;
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        if (this.size == 0 || index < 0 || index >= this.size) {
            return -1;
        }
        
        ListNode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
            
        return cur.val;
    }
    
    public void addAtHead(int val) {
        ListNode node;
        if (this.head == null) {
            node = new ListNode(val, null);
            this.tail = node;
        } else {
            node = new ListNode(val, this.head);
        }
        
        this.head = node;
        this.size++;
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val, null);
        if (this.tail == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        
        this.tail = node;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        
        if (index == this.size) {
            addAtTail(val);
            return;
        }
        
        ListNode prev = null;
        ListNode cur = this.head;
        for (int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
        }
        ListNode node = new ListNode(val, cur);
        prev.next = node;
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            return;
        }
        
        if (index == 0) {
            ListNode newStart = this.head.next;
            this.head = newStart;
            this.size--;
            return;
        }
        
        if (index == this.size && this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }
        
        ListNode prev = null;
        ListNode cur = this.head;
        for (int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
        }
        
        ListNode next = cur.next;
        cur.next = null;
        prev.next = next;
        if (index == this.size - 1) {
            this.tail = prev;
        }
        
        this.size--;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */