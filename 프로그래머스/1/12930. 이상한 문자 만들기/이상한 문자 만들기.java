class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s.toUpperCase());
        int idx = 0;
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if (c == ' ') {
                idx = 0;
            } else {
                if (idx % 2 == 0 && c >= 'a' && c <= 'z') {
                    c -= 32; 
                } else if (idx % 2 == 1 && c >= 'A' && c <= 'Z') {
                    c += 32;
                }
                answer.setCharAt(i, c);
                idx++;
            } 
            
        }
        return answer.toString();
    }
}