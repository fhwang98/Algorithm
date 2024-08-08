class Solution {
    public int solution(String s) {
        
        int answer = 0;
        int sign = 1;
        int idx = 0;
        
        if (s.charAt(idx) == '-' || s.charAt(idx) == '+') {
            if (s.charAt(idx) == '-') sign *= -1;
            idx++;
        }
        
        while (idx < s.length()) {
            answer = answer * 10 + (s.charAt(idx) - '0');
            idx++;
        }
        
        return answer * sign;
    }
}