import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] priorities, int location) {
        List<Integer> list = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        
        int answer = 1; // 몇번째
        while (!list.isEmpty()) {
                int cur = list.remove(0);
                // 뒤에 우선순위 높은 프로세스가 하나라도 있다
                if (list.stream().anyMatch(n -> n > cur)) {

                    // 맨 뒤에 추가
                    list.add(cur);

                    // 현재 위치가 location이었다
                    if (location == 0) {
                        location = list.size() - 1;
                    } else {
                        location--;
                    }
                }  else {
                    // 우선순위 높은 프로세스 없다

                    // 현재 위치가 location이다 ?
                    if (location == 0) {
                        break;
                    }
                    location--;
                    answer++;
                }
            }
            

        return answer;
    }
}