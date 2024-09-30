import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        int answer = 1;
        for (Integer v : map.values()) {
            answer *= (v + 1);
        }
        return answer - 1;
    }
}