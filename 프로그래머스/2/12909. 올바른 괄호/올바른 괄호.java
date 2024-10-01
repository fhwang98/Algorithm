import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if (s.startsWith(")") || s.length() % 2 == 1) return false;
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (stack.isEmpty() && cur == ')') return false;
            if (!stack.isEmpty() && cur == ')') stack.pop();
            else if (cur == '(') stack.push(cur);
        }
        if (!stack.isEmpty()) return false;
        return answer;
    }
}