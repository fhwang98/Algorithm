import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] priorities, int location) {
        if (priorities.length == 1) return 1;
        List<Integer> list = new ArrayList<>();
        for (int p : priorities) {
            list.add(p);
        }
        int answer = 1;
        while (list.size() > 0) {
            // 맨 앞의 숫자가 실행될 수 없음
            if (list.get(0) < getHighest(list)) {
                // 맨 뒷 순서로 이동
                list.add(list.remove(0));
                // location 같이 이동
                if (location == 0) location = list.size() - 1;
                else location--;
            } else {
                // 맨 앞의 숫자가 실행될 차례
                if (location == 0) break;
                else location--;
                list.remove(0);
                answer++;
            }
        }
        return answer;
    }
    public int getHighest(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        return max;
    }
}