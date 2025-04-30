class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    Character peek = stack.peek();
                    if ((c == ')' && peek != '(') || (c == ']' && peek != '[') || (c == '}' && peek != '{')) return false;
                    else stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}