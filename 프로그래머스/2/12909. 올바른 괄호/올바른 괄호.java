class Solution {
    boolean solution(String s) {
        
        if (s.length() % 2 == 1
           || s.startsWith(")")) return false;
        
        boolean answer = true;

        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                cnt++;
            } else if (c == ')' && cnt > 0) {
                // 열린게 있고 닫는다
                cnt--;
            } else if (c == ')' && cnt < 1) {
                // 열린게 없는데 닫는다
                return !answer;
            }
        }

        return cnt == 0 ? answer : !answer;
    }
}