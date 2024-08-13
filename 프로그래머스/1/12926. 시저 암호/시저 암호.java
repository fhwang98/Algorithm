class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(s);
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }
            
            answer.setCharAt(i, c);
        }
        return answer.toString();
    }
}
