class Solution {
    public static String reverseParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            
            if(s.charAt(i) == ')'){
                String reversed = reverseString(s.substring(stack.peek() + 1, i));
                s = s.substring(0, stack.pop()) + reversed + s.substring(i + 1, s.length());
                i -= 2;
            }
        }
        return s;
    }
    
    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}