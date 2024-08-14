import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings);
        Arrays.sort(strings, (s1, s2) -> s1.substring(n, n + 1).compareTo(s2.substring(n, n + 1)));
        
        return strings;
    }
}