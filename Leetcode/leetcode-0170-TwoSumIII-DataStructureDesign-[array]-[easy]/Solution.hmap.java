class TwoSum {
    private ArrayList<Integer> arr;

    public TwoSum() {
        this.arr = new ArrayList<Integer>();
    }
    
    public void add(int number) {
        this.arr.add(number);
    }
    
    public boolean find(int value) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < this.arr.size(); i++) {
            if (!map.containsKey(value - this.arr.get(i))) {
                map.put(this.arr.get(i), i);
            } else {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */