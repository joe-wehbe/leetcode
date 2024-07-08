class Solution {
    public int findTheWinner(int n, int k) {
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        
        int move = 0;
        while(n > 1){
            move++;
            if(move == k){
                move = 0;
                q.poll();
                n--;
            }
            else{
                q.add(q.poll());
            }
        }
        return q.peek();
    }
}