import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            if (map.get(c) > 0) map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }
        for (String key : map.keySet()) {
            return key;
        }
        return null;
    }
}