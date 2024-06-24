class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;

        for(int i = 0; i < tickets.length; i++){
            queue.add(i);
        }
        
        while(tickets[k] > 0){
            int frontIndex = queue.remove();
            int frontNum = tickets[frontIndex];

            if(frontNum > 0){
                queue.add(frontIndex);
                time++;
            }
            tickets[frontIndex] -= 1;
        }
        return time;
    }
}