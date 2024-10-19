import java.util.Stack;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty()) stack.push(arr[i]);
            else if (stack.peek() == arr[i]) stack.pop();
            else stack.push(arr[i]);
            i++;
        }
        if (stack.isEmpty()) stack.push(-1);
        int[] answer = stack.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}