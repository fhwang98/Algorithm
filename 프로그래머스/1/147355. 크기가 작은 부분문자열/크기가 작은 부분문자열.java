class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for (int i = 0; i < t.length() - len + 1; i++) {
            long temp = Long.parseLong(t.substring(i, i + len));
            long pnum = Long.parseLong(p);
            if (temp <= pnum) answer++;
        }
        return answer;
    }
}