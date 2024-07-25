import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int total_len = number.length() - k;

        for (int i = 0; i < number.length(); i++) {
            char cur = number.charAt(i);
            
            while (!stack.isEmpty() && k > 0 && stack.peek() < cur) {
                stack.pop();
                k--;
            }

            if (stack.size() < total_len) {
                stack.push(cur);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (char c : stack) {
            answer.append(c);
        }

        return answer.toString();
    }
}
