class NumberContainers {
    private Map<Integer, TreeSet<Integer>> map;
    private Map<Integer, Integer> indexMap;

    public NumberContainers() {
        this.map = new HashMap();
        this.indexMap = new HashMap();
    }
    
    public void change(int index, int number) {
        if (this.indexMap.containsKey(index)) {
            this.map.get(this.indexMap.get(index)).remove(index);

            if (this.map.get(this.indexMap.get(index)).size() == 0) {
                this.map.remove(this.indexMap.get(index));
            }
        }
        this.indexMap.put(index, number);

        if (this.map.containsKey(number)) {
            this.map.get(number).add(index);
        }
        else {
            TreeSet<Integer> set = new TreeSet();
            set.add(index);
            this.map.put(number, set);
        }
    }
    
    public int find(int number) {
        return this.map.containsKey(number) ? this.map.get(number).first() : -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */