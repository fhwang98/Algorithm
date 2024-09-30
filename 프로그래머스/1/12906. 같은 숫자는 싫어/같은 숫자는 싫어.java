import java.util.Stack;
import java.util.stream.Stream;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int n : arr) {
            if (stack.isEmpty()) stack.push(n);
            else if (stack.peek() != n) stack.push(n);
        }

        return stack.stream()
              .mapToInt(Integer::intValue)
              .toArray();
    }
}