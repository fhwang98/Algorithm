import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // 두 글자씩 끊어서 다중집합 생성
        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = str1.substring(i, i + 2);
            if (Pattern.matches("^[a-z]{2}$", temp)) {
                map1.put(temp, map1.getOrDefault(temp, 0) + 1);
            }
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            String temp = str2.substring(i, i + 2);
            if (Pattern.matches("^[a-z]{2}$", temp)) {
                map2.put(temp, map2.getOrDefault(temp, 0) + 1);
            }
        }

        double union = 0;
        double inter = 0;
        // 합집합 및 교집합 크기 계산
        Set<String> allKeys = new HashSet<>(map1.keySet());
        allKeys.addAll(map2.keySet());

        for (String key : allKeys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            union += Math.max(count1, count2);  // 합집합 크기
            inter += Math.min(count1, count2);  // 교집합 크기
        }

        return (union == 0) ? 65536 : (int) (inter / union * 65536);
        
    }
}
