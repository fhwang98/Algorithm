import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int idx = 0;
        int count = 0;
        while (idx < progresses.length) {
            count = 0;
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            while (idx < progresses.length && progresses[idx] >= 100) {
                count++;
                idx++;
            }
            if (count > 0) answer.add(count);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}