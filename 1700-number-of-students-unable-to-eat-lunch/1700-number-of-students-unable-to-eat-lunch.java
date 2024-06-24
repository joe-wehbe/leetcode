class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        for(int i = 0; i < students.length; i++){
            queue.add(students[i]);
            stack.push(sandwiches[students.length - 1 - i]);
        }
        
        while(!queue.isEmpty()){
            if(queue.peek() == stack.peek()){
                queue.remove();
                stack.pop();
                count = 0;
            }
            else{
                queue.add(queue.remove());
                count++;
                
                if(count == queue.size()){
                    return count;
                }
            }
        }
        return 0;
    }
}