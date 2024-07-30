import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.length() % 2 == 1) return answer;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt((i + j) % s.length());
                if (stack.isEmpty()) {
                    stack.push(c);
                    continue;
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                    continue;
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                    continue;
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }
                
                stack.push(c);
                
            }
            if (stack.size() == 0) answer++;
            stack.clear();
        }
        return answer;
    }
}