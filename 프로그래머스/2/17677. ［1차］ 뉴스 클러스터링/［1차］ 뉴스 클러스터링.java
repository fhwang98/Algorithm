import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int answer = 65536;
        // 같은 문자열이거나 둘다 비어있으면 x
        if ((str1.equals("") && str2.equals(""))
           || str1.equals(str2)) return answer;
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        String s;
        
        for (int i = 0; i < str1.length() - 1; i++) {
            s = str1.substring(i, i + 2);
            if (Pattern.matches("^[a-z]*$", s)) {
                map1.put(s, map1.getOrDefault(s, 0) + 1);
            }
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            s = str2.substring(i, i + 2);
            if (Pattern.matches("^[a-z]*$", s)) {
                map2.put(s, map2.getOrDefault(s, 0) + 1);
            }
        }
        
        int inter = 0;
        int union = 0;
        for (String key : map1.keySet()) {
            System.out.println(key);
            if (map2.containsKey(key)) {
                inter += Math.min(map1.get(key), map2.get(key));
                union += Math.max(map1.get(key), map2.get(key));
            } else {
                union += map1.get(key);
            }
        }
        System.out.println("---------------");
        for (String key : map2.keySet()) {
            if (!map1.containsKey(key)) { 
                union += map2.get(key);    
            }
            System.out.println(key);
        }
        System.out.println("inter: " + inter);
        System.out.println("union: " + union);
        answer = answer * inter / union;
        
        return answer;
    }
}