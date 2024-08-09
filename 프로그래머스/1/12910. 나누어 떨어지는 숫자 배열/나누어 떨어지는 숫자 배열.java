import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int n : arr) {
            if (n % divisor == 0) answer.add(n);
        }
        if (answer.size() == 0) return new int[] {-1};
        return answer.stream().sorted().mapToInt(i->i).toArray();
    }
}