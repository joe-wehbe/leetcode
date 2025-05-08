class MyHashSet {
    private ArrayList<Integer> list;

    public MyHashSet() {
        this.list = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!contains(key)) {
            this.list.add(key);
        }
    }
    
    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */