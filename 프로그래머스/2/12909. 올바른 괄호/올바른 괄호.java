class Solution {
    boolean solution(String s) {
        // 길이가 홀수거나 )로 시작하면 바로 false
        if (s.length() % 2 == 1 || s.startsWith(")")) return false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') count++;
            else if (cur == ')' && count < 1) return false;
            else if (cur == ')') count--;
        }
        if (count != 0) return false;
        return true;
    }
}