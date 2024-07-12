import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        boolean answer = false;
        
        if (s.length() % 2 == 1 ||
            s.startsWith(")") || s.endsWith("(")) return answer;
        
        String[] arr = s.split("");
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                cnt++;
            } else if (cnt < 1) {
                return answer;
            } else {
                cnt--;
            }
        }
        
        if (cnt == 0) answer = true;

        return answer;
    }
}