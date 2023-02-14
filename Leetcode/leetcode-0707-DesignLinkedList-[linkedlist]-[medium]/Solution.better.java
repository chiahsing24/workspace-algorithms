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
        if (this.size == 0 || index < 0 || index >= size) {
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
        ListNode newNode = new ListNode(val, null);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
        }

        head = newNode;
        this.size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val, null);
        if (this.tail == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        
        this.tail = newNode;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= this.size) {
            if (index == 0) {
                addAtHead(val);
                return;
            }

            if (index == this.size) {
                addAtTail(val);
                return;
            }

            ListNode prev = null;
            ListNode cur = this.head;;
            while (index > 0) {
                prev = cur;
                cur = cur.next;
                index--;
            }

            ListNode newNode = new ListNode(val, null);
            prev.next = newNode;
            newNode.next = cur;
            this.size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            return;
        }

        if (index == 0 && this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }

        if (index == 0) {
            this.head = this.head.next;
            this.size--;
            return;
        }

        ListNode prev = null;
        ListNode cur = this.head;
        while (index > 0) {
            prev = cur;
            cur = cur.next;
            index--;
        }


        prev.next = cur.next;
        if (cur.next == null) {
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