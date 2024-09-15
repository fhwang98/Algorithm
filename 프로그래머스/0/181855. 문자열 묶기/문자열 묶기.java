import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int len = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
            len = s.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
            max = Math.max(max, map.get(len));
        }
        return max;
    }
}