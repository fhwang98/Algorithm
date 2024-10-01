import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if (s.startsWith(")") || s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == ')') {
                if (stack.isEmpty()) return false;    
                else stack.pop();
            } else {
                stack.push(cur);
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}