class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int depth = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
                count++;
                
                if(count > depth){
                    depth = count;
                }
            }
            
            if(s.charAt(i) == ')'){
                stack.pop();
                count--;
            }
        }
        return depth;
    }
}