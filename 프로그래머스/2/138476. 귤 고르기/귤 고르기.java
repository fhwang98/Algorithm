import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
entryList.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        for(Map.Entry<Integer, Integer> entry : entryList){
            if (k < 1) break;
            k -= entry.getValue();
            answer++;
    ;
}
        return answer;
    }
}