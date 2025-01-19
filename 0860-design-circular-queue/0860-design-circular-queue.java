class MyCircularQueue {

    private ArrayList<Integer> queue;
    private int k;

    public MyCircularQueue(int k) {
        queue = new ArrayList<>();
        this.k = k;
    }
    
    public boolean enQueue(int value) {
        if (queue.size() >= k) {
            return false;
        }

        queue.add(value);
        return true;
    }
    
    public boolean deQueue() {
        if (queue.size() == 0) {
            return false;
        }

        queue.remove(0);
        return true;
    }
    
    public int Front() {
        if (queue.size() == 0) {
            return -1;
        }

        return queue.get(0);
    }
    
    public int Rear() {
        if (queue.size() == 0) {
            return -1;
        }

        return queue.get(queue.size() - 1);
    }
    
    public boolean isEmpty() {
        return queue.size() == 0;
    }
    
    public boolean isFull() {
        return queue.size() == k;
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