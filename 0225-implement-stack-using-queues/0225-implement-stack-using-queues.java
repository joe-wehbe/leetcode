class MyStack {

    private Queue<Integer> q1 = new LinkedList<>(); 
    private Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        q1.offer(x);       
    }
    
    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int num = q1.poll();

        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

        return num;        
    }
    
    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int num = q1.poll();
        q2.offer(num);

        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

        return num;        
    }
    
    public boolean empty() {
        return q1.size() == 0;        
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