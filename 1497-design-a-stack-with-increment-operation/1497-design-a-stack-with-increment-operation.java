class CustomStack {
    private ArrayList<Integer> list;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.list = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if (list.size() < this.maxSize) list.add(x);
    }
    
    public int pop() {
        if (list.size() == 0) return -1;
        int num = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return num;
    }
    
    public void increment(int k, int val) {
        if (list.size() < k) k = list.size();

        for (int i = 0; i < k; i++) {
            list.set(i, list.get(i) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */