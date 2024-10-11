import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        for (int num : num_list) {
            answer.add(num);
        }
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        switch (n) {
            case 1:
                answer = answer.subList(0, b + 1);
                break;
            case 2:
                answer = answer.subList(a, answer.size());
                break;
            case 3:
                answer = answer.subList(a, b + 1);
                break;
            case 4:
                answer.clear();
                for (int i = a; i <= b; i += c) {
                    answer.add(num_list[i]);
                }
                break;
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}